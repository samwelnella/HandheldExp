package com.handheld.exp.models

class ButtonItem(
    label: String,
    key: String,
    path: List<String> = listOf(),
    sortKey: String = "",
    disabled: Boolean = false,
    val onClick: () -> Unit
) : Item(label, key, path, sortKey, disabled)