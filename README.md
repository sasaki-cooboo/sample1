# spring boot sample todo アプリ

## 機能一覧

- TODO 一覧表示: /todo
- TODO 変更: /todo
- TODO 追加 /todo/add

## TODO の項目

- 状態 完了/未完了
- タスク テキスト：最大 20 文字
- 期限 YYYY-MM-DD 形式

## DB

MySQL を使用する

## 起動

```sh
docker compose exec app /bin/bash
./gradlew build
java -jar build/libs/sample1-0.0.1-SNAPSHOT.jar
```
