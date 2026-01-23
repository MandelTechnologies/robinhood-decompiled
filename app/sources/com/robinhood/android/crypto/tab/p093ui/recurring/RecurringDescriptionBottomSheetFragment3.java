package com.robinhood.android.crypto.tab.p093ui.recurring;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhContentBottomSheet2;
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.Preconditions;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDescriptionBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"RecurringDescriptionBottomSheetComposable", "", "dismiss", "Lkotlin/Function0;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "(Lkotlin/jvm/functions/Function0;Lcom/robinhood/shared/app/type/AppType;Landroidx/compose/runtime/Composer;I)V", "feature-crypto-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.ui.recurring.RecurringDescriptionBottomSheetFragmentKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RecurringDescriptionBottomSheetFragment3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringDescriptionBottomSheetComposable$lambda$0(Function0 function0, AppType appType, int i, Composer composer, int i2) {
        RecurringDescriptionBottomSheetComposable(function0, appType, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RecurringDescriptionBottomSheetComposable(final Function0<Unit> dismiss, final AppType appType, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Composer composerStartRestartGroup = composer.startRestartGroup(324181171);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(dismiss) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(appType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(324181171, i2, -1, "com.robinhood.android.crypto.tab.ui.recurring.RecurringDescriptionBottomSheetComposable (RecurringDescriptionBottomSheetFragment.kt:36)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1209721032, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.recurring.RecurringDescriptionBottomSheetFragmentKt.RecurringDescriptionBottomSheetComposable.1

                /* compiled from: RecurringDescriptionBottomSheetFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.crypto.tab.ui.recurring.RecurringDescriptionBottomSheetFragmentKt$RecurringDescriptionBottomSheetComposable$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[AppType.values().length];
                        try {
                            iArr[AppType.NCW.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[AppType.RHC.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[AppType.TRADER.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    int i4;
                    int i5;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1209721032, i3, -1, "com.robinhood.android.crypto.tab.ui.recurring.RecurringDescriptionBottomSheetComposable.<anonymous> (RecurringDescriptionBottomSheetFragment.kt:38)");
                    }
                    AppType appType2 = appType;
                    int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                    int i6 = iArr[appType2.ordinal()];
                    if (i6 == 1) {
                        Preconditions.INSTANCE.failUnknownEnumKotlin(null);
                        throw new ExceptionsH();
                    }
                    if (i6 == 2) {
                        i4 = C13013R.string.rhc_recurring_bottom_sheet_title;
                    } else {
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i4 = C13013R.string.crypto_recurring_bottom_sheet_title;
                    }
                    String strStringResource = StringResources_androidKt.stringResource(i4, composer2, 0);
                    int i7 = iArr[appType.ordinal()];
                    if (i7 == 1) {
                        Preconditions.INSTANCE.failUnknownEnumKotlin(null);
                        throw new ExceptionsH();
                    }
                    if (i7 == 2) {
                        i5 = C13013R.string.rhc_recurring_bottom_sheet_description_v2;
                    } else {
                        if (i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i5 = C13013R.string.crypto_recurring_bottom_sheet_description;
                    }
                    RhContentBottomSheet2.RhContentBottomSheetLayout(strStringResource, null, StringResources_androidKt.stringResource(i5, new Object[]{3}, composer2, 0), StringResources_androidKt.stringResource(C11048R.string.general_label_ok, composer2, 0), null, dismiss, null, null, null, null, composer2, 24624, 960);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.recurring.RecurringDescriptionBottomSheetFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringDescriptionBottomSheetFragment3.RecurringDescriptionBottomSheetComposable$lambda$0(dismiss, appType, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
