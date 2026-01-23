package com.robinhood.android.common.options.upsell.fridaytrading;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionDiscoverZeroDteSnackbarState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteSnackbarState;", "", "<init>", "(Ljava/lang/String;I)V", "NETWORK_REQUEST_STARTED", "NETWORK_REQUEST_FAILED", "SHOWING", "DISMISSED", "maybeShowing", "", "getMaybeShowing", "()Z", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class OptionDiscoverZeroDteSnackbarState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionDiscoverZeroDteSnackbarState[] $VALUES;
    public static final OptionDiscoverZeroDteSnackbarState NETWORK_REQUEST_STARTED = new OptionDiscoverZeroDteSnackbarState("NETWORK_REQUEST_STARTED", 0);
    public static final OptionDiscoverZeroDteSnackbarState NETWORK_REQUEST_FAILED = new OptionDiscoverZeroDteSnackbarState("NETWORK_REQUEST_FAILED", 1);
    public static final OptionDiscoverZeroDteSnackbarState SHOWING = new OptionDiscoverZeroDteSnackbarState("SHOWING", 2);
    public static final OptionDiscoverZeroDteSnackbarState DISMISSED = new OptionDiscoverZeroDteSnackbarState("DISMISSED", 3);

    /* compiled from: OptionDiscoverZeroDteSnackbarState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionDiscoverZeroDteSnackbarState.values().length];
            try {
                iArr[OptionDiscoverZeroDteSnackbarState.NETWORK_REQUEST_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionDiscoverZeroDteSnackbarState.SHOWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionDiscoverZeroDteSnackbarState.DISMISSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionDiscoverZeroDteSnackbarState.NETWORK_REQUEST_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ OptionDiscoverZeroDteSnackbarState[] $values() {
        return new OptionDiscoverZeroDteSnackbarState[]{NETWORK_REQUEST_STARTED, NETWORK_REQUEST_FAILED, SHOWING, DISMISSED};
    }

    public static EnumEntries<OptionDiscoverZeroDteSnackbarState> getEntries() {
        return $ENTRIES;
    }

    private OptionDiscoverZeroDteSnackbarState(String str, int i) {
    }

    static {
        OptionDiscoverZeroDteSnackbarState[] optionDiscoverZeroDteSnackbarStateArr$values = $values();
        $VALUES = optionDiscoverZeroDteSnackbarStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionDiscoverZeroDteSnackbarStateArr$values);
    }

    public final boolean getMaybeShowing() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static OptionDiscoverZeroDteSnackbarState valueOf(String str) {
        return (OptionDiscoverZeroDteSnackbarState) Enum.valueOf(OptionDiscoverZeroDteSnackbarState.class, str);
    }

    public static OptionDiscoverZeroDteSnackbarState[] values() {
        return (OptionDiscoverZeroDteSnackbarState[]) $VALUES.clone();
    }
}
