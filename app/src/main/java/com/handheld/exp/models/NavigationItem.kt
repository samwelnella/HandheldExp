package com.handheld.exp.models

class NavigationItem(
    label: String,
    key: String,
    path: List<String> = listOf(),
    sortKey: String = "",
    disabled: Boolean = false,
    ) : Item(label, key, path, sortKey, disabled)