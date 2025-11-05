# AuroraRoleplaySAMP - GitHub Actions build package

Este pacote contém um esqueleto de projeto pronto para ser enviado ao GitHub e gerar o APK automático via Actions.

O que está incluído:
- `app/src/main/...` com `AndroidManifest.xml`, `MainActivity.java`, `res/values/strings.xml`
- `app/src/main/res/mipmap-xxxhdpi/ic_launcher.png` (ícone gerado a partir da sua imagem)
- `app/src/main/res/drawable/splash.png` (splash gerado a partir da sua imagem)
- `.github/workflows/build.yml` (workflow que compila e assina o APK usando segredos)
- `AuroraRoleplaySAMP.apk` será o nome final esperado no workflow (ajustável)
- Instruções para configurar segredos

### Passos para usar

1. Crie um repositório no GitHub (ex: `AuroraRoleplaySAMP`) e faça upload/commit deste pacote.
2. Adicione o Gradle wrapper e o projeto Android real se ainda não tiver.
3. Configure os segredos em **Settings → Secrets and variables → Actions**:
   - `KEYSTORE_BASE64`: conteúdo do seu `aurora-release.keystore` codificado em base64
   - `STORE_PASS`: senha do keystore
   - `KEY_PASS`: senha da chave
   - `ALIAS`: alias da chave (ex: `aurora_key`)
4. Faça push para `main`. Vá em **Actions → Build Aurora Roleplay APK** e execute o workflow.
5. Artefatos: o APK assinado aparecerá na aba Artifacts.

### Nota técnica
- Este projeto é um esqueleto. Para ter um launcher SAMP totalmente funcional, é necessário integrar o código nativo do cliente SAMP Android (não incluso aqui por compatibilidade/licença).
- O `MainActivity.java` aqui abre um intento simples `samp://188.165.192.24:5644` ao clicar em "Conectar". Ajuste conforme a integração real do cliente SAMP.
