package com.robinhood.shared.portfolio.lists.p391ui;

import com.robinhood.android.common.portfolio.unified.DisplayType;
import com.robinhood.models.p320db.CuratedListViewMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CuratedListStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"toDisplayType", "Lcom/robinhood/android/common/portfolio/unified/DisplayType;", "Lcom/robinhood/models/db/CuratedListViewMode;", "lib-lists-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListStateProviderKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CuratedListStateProvider2 {

    /* compiled from: CuratedListStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListStateProviderKt$WhenMappings */
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayType toDisplayType(CuratedListViewMode curatedListViewMode) {
        int i = curatedListViewMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[curatedListViewMode.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return DisplayType.LAST_PRICE;
            }
            if (i == 2) {
                return DisplayType.PERCENT_CHANGE;
            }
            if (i == 3) {
                return DisplayType.TOTAL_PERCENT_CHANGE;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return DisplayType.LAST_PRICE;
    }
}
