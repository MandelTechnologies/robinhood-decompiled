package com.robinhood.android.common.extensions;

import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.models.p320db.CuratedListViewMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListViewModes.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toSecurityViewMode", "Lcom/robinhood/android/common/util/SecurityViewMode;", "Lcom/robinhood/models/db/CuratedListViewMode;", "feature-lib-lists_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.extensions.CuratedListViewModesKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CuratedListViewModes {

    /* compiled from: CuratedListViewModes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.extensions.CuratedListViewModesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CuratedListViewMode.values().length];
            try {
                iArr[CuratedListViewMode.LAST_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CuratedListViewMode.PERCENT_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CuratedListViewMode.TOTAL_PERCENT_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CuratedListViewMode.FUTURES_MARGIN_REQUIREMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final SecurityViewMode toSecurityViewMode(CuratedListViewMode curatedListViewMode) {
        Intrinsics.checkNotNullParameter(curatedListViewMode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[curatedListViewMode.ordinal()];
        if (i == 1) {
            return SecurityViewMode.LAST_PRICE;
        }
        if (i == 2) {
            return SecurityViewMode.PERCENT_CHANGE;
        }
        if (i == 3) {
            return SecurityViewMode.TOTAL_PERCENT_CHANGE;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return SecurityViewMode.FUTURES_MARGIN_REQUIREMENT;
    }
}
