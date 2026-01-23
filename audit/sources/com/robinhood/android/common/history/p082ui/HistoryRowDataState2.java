package com.robinhood.android.common.history.p082ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.history.p082ui.HistoryRowViewState;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryRowDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\" \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0018\u0010\u000b\u001a\u00020\f*\u00020\b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"HistoryRowStateProvider", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/common/history/ui/HistoryRowDataState;", "Lcom/robinhood/android/common/history/ui/HistoryRowViewState;", "getHistoryRowStateProvider", "()Lcom/robinhood/android/udf/StateProvider;", "startIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummary;", "getStartIcon", "(Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummary;)Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "startIconTint", "Landroidx/compose/ui/graphics/Color;", "getStartIconTint", "(Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummary;Landroidx/compose/runtime/Composer;I)J", "lib-history-row_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.history.ui.HistoryRowDataStateKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class HistoryRowDataState2 {
    private static final StateProvider<HistoryRowDataState, HistoryRowViewState> HistoryRowStateProvider = new StateProvider() { // from class: com.robinhood.android.common.history.ui.HistoryRowDataStateKt$HistoryRowStateProvider$1
        @Override // com.robinhood.android.udf.StateProvider
        public final HistoryRowViewState reduce(HistoryRowDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            TransactionSummary summary = dataState.getSummary();
            return summary != null ? new HistoryRowViewState.Loaded(summary) : HistoryRowViewState.Loading.INSTANCE;
        }
    };

    /* compiled from: HistoryRowDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.history.ui.HistoryRowDataStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransactionSummary.SecondarySummaryState.values().length];
            try {
                iArr[TransactionSummary.SecondarySummaryState.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionSummary.SecondarySummaryState.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionSummary.SecondarySummaryState.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StateProvider<HistoryRowDataState, HistoryRowViewState> getHistoryRowStateProvider() {
        return HistoryRowStateProvider;
    }

    public static final ServerToBentoAssetMapper2 getStartIcon(TransactionSummary.SecondarySummary secondarySummary) {
        Intrinsics.checkNotNullParameter(secondarySummary, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[secondarySummary.getState().ordinal()];
        if (i == 1) {
            return ServerToBentoAssetMapper2.DOT_16;
        }
        if (i == 2) {
            return ServerToBentoAssetMapper2.CHECKMARK_16;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return ServerToBentoAssetMapper2.EXCLAMATION_16;
    }

    @JvmName
    public static final long getStartIconTint(TransactionSummary.SecondarySummary secondarySummary, Composer composer, int i) {
        long jM21373getBg30d7_KjU;
        Intrinsics.checkNotNullParameter(secondarySummary, "<this>");
        composer.startReplaceGroup(1231903598);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1231903598, i, -1, "com.robinhood.android.common.history.ui.<get-startIconTint> (HistoryRowDataState.kt:29)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[secondarySummary.getState().ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-1551612271);
            jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU();
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(-1551609578);
            jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
            composer.endReplaceGroup();
        } else {
            if (i2 != 3) {
                composer.startReplaceGroup(-1551614974);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-1551606858);
            jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21373getBg30d7_KjU;
    }
}
