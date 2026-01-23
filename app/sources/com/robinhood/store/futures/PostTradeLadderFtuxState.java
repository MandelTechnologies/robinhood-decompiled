package com.robinhood.store.futures;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostTradeLadderFtuxState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\b\u001a\u0004\u0018\u00010\u0000H&j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/store/futures/PostTradeLadderFtuxState;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_SEEN", "SHOW_FLATTEN_ORDERS_TOOLTIP", "SHOW_PNL_AND_PRICE_SWITCHER_TOOLTIP", "ALREADY_SEEN", "nextState", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class PostTradeLadderFtuxState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PostTradeLadderFtuxState[] $VALUES;
    public static final PostTradeLadderFtuxState NOT_SEEN = new PostTradeLadderFtuxState("NOT_SEEN", 0) { // from class: com.robinhood.store.futures.PostTradeLadderFtuxState.NOT_SEEN
        /* renamed from: nextState, reason: collision with other method in class */
        public Void m26481nextState() {
            return null;
        }

        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.store.futures.PostTradeLadderFtuxState
        public /* bridge */ /* synthetic */ PostTradeLadderFtuxState nextState() {
            return (PostTradeLadderFtuxState) m26481nextState();
        }
    };
    public static final PostTradeLadderFtuxState SHOW_FLATTEN_ORDERS_TOOLTIP = new PostTradeLadderFtuxState("SHOW_FLATTEN_ORDERS_TOOLTIP", 1) { // from class: com.robinhood.store.futures.PostTradeLadderFtuxState.SHOW_FLATTEN_ORDERS_TOOLTIP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.store.futures.PostTradeLadderFtuxState
        public PostTradeLadderFtuxState nextState() {
            return PostTradeLadderFtuxState.SHOW_PNL_AND_PRICE_SWITCHER_TOOLTIP;
        }
    };
    public static final PostTradeLadderFtuxState SHOW_PNL_AND_PRICE_SWITCHER_TOOLTIP = new PostTradeLadderFtuxState("SHOW_PNL_AND_PRICE_SWITCHER_TOOLTIP", 2) { // from class: com.robinhood.store.futures.PostTradeLadderFtuxState.SHOW_PNL_AND_PRICE_SWITCHER_TOOLTIP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.store.futures.PostTradeLadderFtuxState
        public PostTradeLadderFtuxState nextState() {
            return PostTradeLadderFtuxState.ALREADY_SEEN;
        }
    };
    public static final PostTradeLadderFtuxState ALREADY_SEEN = new PostTradeLadderFtuxState("ALREADY_SEEN", 3) { // from class: com.robinhood.store.futures.PostTradeLadderFtuxState.ALREADY_SEEN
        @Override // com.robinhood.store.futures.PostTradeLadderFtuxState
        public PostTradeLadderFtuxState nextState() {
            return this;
        }

        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }
    };

    private static final /* synthetic */ PostTradeLadderFtuxState[] $values() {
        return new PostTradeLadderFtuxState[]{NOT_SEEN, SHOW_FLATTEN_ORDERS_TOOLTIP, SHOW_PNL_AND_PRICE_SWITCHER_TOOLTIP, ALREADY_SEEN};
    }

    public /* synthetic */ PostTradeLadderFtuxState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<PostTradeLadderFtuxState> getEntries() {
        return $ENTRIES;
    }

    public abstract PostTradeLadderFtuxState nextState();

    private PostTradeLadderFtuxState(String str, int i) {
    }

    static {
        PostTradeLadderFtuxState[] postTradeLadderFtuxStateArr$values = $values();
        $VALUES = postTradeLadderFtuxStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(postTradeLadderFtuxStateArr$values);
    }

    public static PostTradeLadderFtuxState valueOf(String str) {
        return (PostTradeLadderFtuxState) Enum.valueOf(PostTradeLadderFtuxState.class, str);
    }

    public static PostTradeLadderFtuxState[] values() {
        return (PostTradeLadderFtuxState[]) $VALUES.clone();
    }
}
