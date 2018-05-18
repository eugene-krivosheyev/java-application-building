# Проблема
При работе с git под Windows часто получается, что остается чужая учетная запись github  после предыдущего пользователя. И push в свой репозиторий не проходит, т.к. под чужой учеткой.

# Что делать
## 1. Изменить имя пользователя и email, под которыми автор появляется в писке коммитов:
```bash
git config --global user.email "my@email.com"
git config --global user.name "My Name"
```

## 2. Сбросить учетку github прошлого пользователя
2.1. Установить менеджер паролей git как стандартное хранилище паролей Windows
```bash
git config --global credential.helper manager
```
2.2. Найти в панели управления Windows компонент Credential Manager и удалить там прошлую учетную запись github.

## 3. Если не помог п.2
3.1. Установить менеджер паролей git как файловое хранилище паролей
```bash
git config --global --unset credential.helper
git config --system --unset credential.helper
git config --global credential.helper store
```
3.2. Проверить
```bash
git config --system --list
```

3.3. Установить логин для репо
```bash
git clone https://USERNAME@github.com/USERNAME/PROJECTNAME.git
```
или если репо уже склонирован,
```bash
git remote set-url origin https://USERNAME@github.com/USERNAME/PROJECTNAME.git
```

3.4. Помните, что store хранит пароли в открытом виде.

## 4. Если не помог п.3
Храним логин и пароль в URL репозитория. 100% вариант, но афишируем пароль.
```bash
git remote set-url origin https://USERNAME:PWD@github.com/USERNAME/PROJECTNAME.git
```
