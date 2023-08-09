# ネーミングルール

## 識別子

識別子は、ドキュメントの一覧化など情報を整理する上で、一意に特定できるようにするためのものです。

したがって、プログラミングをする際には、ソースコードの理解の妨げになることから、次にあげるものに識別子は**使用しないでください**。

- ソースファイル名

- クラス名

- メソッド名

- 変数名

プログラミングにおいてこれらの名前には、読んで意味が理解できるようにするという大原則があります。識別子を利用してしまうとソースコードだけでは意味が理解できなくなってしまいます。

### システムID

システムIDはシステムそのものを特定するための文字列です。

#### 書式

a

| 記号 | 意味             | 例  |
|------|------------------|-----|
| a    | K固定。KENSYUのK | K   |

#### 例

K

### 機能ID

機能IDは、システムにおける機能を特定するための文字列です。

#### 書式

abbccc

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 61%" />
<col style="width: 21%" />
</colgroup>
<thead>
<tr class="header">
<th>記号</th>
<th>意味</th>
<th>例</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>a</td>
<td>システムID</td>
<td>K</td>
</tr>
<tr class="even">
<td>bb</td>
<td><p>機能タイプ。以下の内のいずれか。</p>
<p>AP ... アプリケーション</p>
<p>BT ... バッチ</p></td>
<td>AP</td>
</tr>
<tr class="odd">
<td>ccc</td>
<td>頭0付き3桁の連番。0から始まる。</td>
<td>000、010、200</td>
</tr>
</tbody>
</table>

#### 例

- KAP001

- KBT030

### 画面ID

#### 書式

abbcccVddd

| 記号  | 意味                                | 例         |
|-------|-------------------------------------|------------|
| abbcc | 機能ID                              | KFR01      |
| Vdd   | “V”+頭0付き3桁の連番。0から始まる。 | V000、V100 |

#### 例

- KAP010V010

### 処理ID

#### 書式

abbcccPeee

| 記号   | 意味                                | 例         |
|--------|-------------------------------------|------------|
| abbccc | 機能ID                              | KFR01      |
| Peee   | “P”+頭0付き2桁の連番。0から始まる。 | P010、P100 |

#### 例

- KAP010P000

- KBT010P010

### データベース名

システム用のデータベースを作成する際の名称です。

#### 書式

a_fff...

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 57%" />
<col style="width: 25%" />
</colgroup>
<thead>
<tr class="header">
<th>記号</th>
<th>意味</th>
<th>例</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>a</td>
<td>システムID</td>
<td>K</td>
</tr>
<tr class="even">
<td>fff...</td>
<td><p>データベース名称。大文字、数字で構成する。</p>
<p>複数の単語をつなげる場合は _ を使用する。</p></td>
<td>SERVICE_MANAGE</td>
</tr>
</tbody>
</table>

#### 例

- K_DATABASE

### データベースオブジェクト名

システム用のデータベース内に作成するテーブル、ビュー、インデックスなどのオブジェクトの名称です。

#### 書式

g_hhh...

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 59%" />
<col style="width: 24%" />
</colgroup>
<thead>
<tr class="header">
<th>記号</th>
<th>意味</th>
<th>例</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>g</td>
<td><p>オブジェクト種別</p>
<p>T ... テーブル</p>
<p>V ... ビュー</p>
<p>IDX ... インデックス</p>
<p>FK ... 外部キー</p>
<p>など</p></td>
<td>T</td>
</tr>
<tr class="even">
<td>hhh...</td>
<td><p>オブジェクト名。大文字、数字で構成する。</p>
<p>複数の単語をつなげる場合は _ を使用する。</p></td>
<td><p>MEMBER</p>
<p>BILLING_DETAIL</p></td>
</tr>
</tbody>
</table>

#### 例

- T_MEMBER

- V_BILLING_DETAIL

- IDX_T_MEMBER_ID

### 画面要素(フィールド)名

UIに配置する表示、入力要素の名称です。

#### 書式

iii...

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 60%" />
<col style="width: 23%" />
</colgroup>
<thead>
<tr class="header">
<th>記号</th>
<th>意味</th>
<th>例</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>iii...</td>
<td><p>要素名。</p>
<p>小文字キャメルケース(lowerCamelCase)で命名する。</p></td>
<td><p>name</p>
<p>postNumber</p></td>
</tr>
</tbody>
</table>

#### 例

- name

- postNumber
