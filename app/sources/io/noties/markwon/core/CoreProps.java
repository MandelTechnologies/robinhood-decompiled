package io.noties.markwon.core;

import io.noties.markwon.Prop;

/* loaded from: classes14.dex */
public abstract class CoreProps {
    public static final Prop<ListItemType> LIST_ITEM_TYPE = Prop.m3343of("list-item-type");
    public static final Prop<Integer> BULLET_LIST_ITEM_LEVEL = Prop.m3343of("bullet-list-item-level");
    public static final Prop<Integer> ORDERED_LIST_ITEM_NUMBER = Prop.m3343of("ordered-list-item-number");
    public static final Prop<Integer> HEADING_LEVEL = Prop.m3343of("heading-level");
    public static final Prop<String> LINK_DESTINATION = Prop.m3343of("link-destination");
    public static final Prop<Boolean> PARAGRAPH_IS_IN_TIGHT_LIST = Prop.m3343of("paragraph-is-in-tight-list");
    public static final Prop<String> CODE_BLOCK_INFO = Prop.m3343of("code-block-info");

    public enum ListItemType {
        BULLET,
        ORDERED
    }
}
