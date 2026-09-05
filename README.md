# AE2 Recent Search (Forge 1.20.1) / AE2 最近搜索（Forge 1.20.1）

这是 [zh5112/AE2-Recent-Search](https://github.com/zh5112/AE2-Recent-Search)（Minecraft 1.21.1 NeoForge 版）的 **Minecraft 1.20.1 Forge 移植版**。

AE2 Recent Search 是一个 Applied Energistics 2 / 应用能源 2 的客户端附属模组，为 AE2 终端添加“最近搜索 / 搜索历史记录”功能，并提供收藏与单条删除，方便重复使用物品名、模组筛选、标签筛选、tooltip 搜索、物品 ID 搜索等 AE2 搜索表达式。

## 功能

- 在 AE2 终端搜索框下方显示最近搜索记录。
- 按 Minecraft 账号在本地保存历史记录。
- 完全相同的搜索词不会重复记录，再次使用时会移动到最上方。
- 支持 AE2 搜索语法，例如 `@mod`、`#tag`、`$tooltip`、`*id`。
- 支持收藏搜索词，收藏项显示在普通历史记录上方。
- 支持删除单条历史记录。
- 点击历史记录可选择“立即搜索”或“仅填入搜索框”。
- 支持鼠标滚轮滚动查看更多历史记录。
- 支持按住收藏条目拖拽排序。
- 键盘上下键导航可在按键设置中自定义。
- 在 AE2 终端设置界面内提供开关、清空、收藏、删除、滚轮、拖拽和点击行为设置。
- 可选同步点击的最近搜索到 JEI / REI / EMI 搜索框（仅当 AE2 自身开启外部搜索同步时生效）。

## 需求

- Minecraft 1.20.1
- Forge 47.1.3 或更高版本
- Applied Energistics 2 15.4.10 或更高版本（含其依赖 GuideME）

JEI / REI / EMI 是可选依赖。

## 使用方法

打开 AE2 终端并点击搜索框。如果已有最近搜索记录，它们会显示在搜索框下方。点击一条历史记录时，会按照终端设置执行“立即搜索”或“仅填入”。搜索框右侧的星标按钮可收藏或取消收藏当前搜索词；历史记录右侧的删除按钮可删除单条记录。最近搜索设置可以在 AE2 终端的设置界面中找到。

## 配置

显示的历史记录数量由客户端配置控制：`maxVisibleEntries = 10`（配置文件 `config/ae2_recent_search-client.toml`）。每个玩家的历史记录和游戏内开关状态保存在 `config/ae2_recent_search_history.json`。

## 构建

要求 JDK 17。首次运行会通过 Gradle Wrapper 下载 Gradle 8.1.1 及 ForgeGradle 依赖。若 Java 不在 PATH 中，需先指定 `JAVA_HOME` 指向你的 JDK 17：

```
set JAVA_HOME=<你的 JDK 17 路径>
gradlew.bat build
```

产物位于 `build/libs/ae2_recent_search-1.3.1.jar`。开发环境运行：

```
gradlew.bat runClient
gradlew.bat runServer
```

## 许可证

MIT。移植自 [zh5112/AE2-Recent-Search](https://github.com/zh5112/AE2-Recent-Search)。

---

## English Introduction

AE2 Recent Search is a client-side addon for Applied Energistics 2 on Minecraft 1.20.1 with Forge. This is a port of the original [zh5112/AE2-Recent-Search](https://github.com/zh5112/AE2-Recent-Search) for Minecraft 1.21.1 NeoForge.

It adds recent search history to AE2 terminals, with favorite entries and per-entry deletion, making it easier to reuse previous searches such as item names, mod filters, tag filters, tooltip searches, and item ID searches.

### Features

- Shows recent searches below the AE2 terminal search box.
- Stores history locally per Minecraft account.
- Keeps exact duplicate searches as one entry and moves reused searches to the top.
- Supports special AE2 search syntax such as `@mod`, `#tag`, `$tooltip`, and `*id`.
- Supports favorite search entries, shown above normal history.
- Supports deleting individual history entries.
- Lets history entries either search immediately or only fill the search box.
- Supports mouse wheel scrolling to browse more history entries.
- Supports dragging favorite entries to reorder them.
- Keyboard navigation keys are rebindable in the controls settings.
- Adds an in-terminal settings page for enabling, clearing, favorites, deletion, scrolling, dragging, and click behavior.
- Can optionally sync clicked recent searches to JEI/REI/EMI through AE2's external search integration.
- Uses an AE2-style UI instead of a separate config-only workflow.

### Requirements

- Minecraft 1.20.1
- Forge 47.1.3 or newer
- Applied Energistics 2 15.4.10 or newer (with its GuideME dependency)

JEI, REI, or EMI is optional. External search sync only applies when AE2's own external search sync is enabled.

### Usage

Open an AE2 terminal and click the search box. If recent searches exist, they appear directly below the search field.

Clicking an entry applies it according to the terminal setting:

- Click: Search applies the search immediately and closes the recent-search popup.
- Click: Fill only fills the search box so you can edit the text before searching.

Use the star button inside the search field to favorite or unfavorite the current search. Use the delete button on a history row to remove that entry.

The recent-search settings are available from AE2's terminal settings screen.

### Configuration

The number of visible history entries is controlled by the client config `maxVisibleEntries = 10` (in `config/ae2_recent_search-client.toml`). Per-player history and in-game toggle states are stored in `config/ae2_recent_search_history.json`.

### License

MIT. Ported from [zh5112/AE2-Recent-Search](https://github.com/zh5112/AE2-Recent-Search).
