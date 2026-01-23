package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.models.serverdriven.experimental.api.LoadingSpinner;
import com.robinhood.models.serverdriven.experimental.api.LoadingSpinnerSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiLoadingSpinner.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"SduiLoadingSpinner", "", "ActionT", "Landroid/os/Parcelable;", "loadingSpinner", "Lcom/robinhood/models/serverdriven/experimental/api/LoadingSpinner;", "(Lcom/robinhood/models/serverdriven/experimental/api/LoadingSpinner;Landroidx/compose/runtime/Composer;I)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiLoadingSpinnerKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiLoadingSpinner2 {

    /* compiled from: SduiLoadingSpinner.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiLoadingSpinnerKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadingSpinnerSize.values().length];
            try {
                iArr[LoadingSpinnerSize.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadingSpinnerSize.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadingSpinnerSize.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoadingSpinnerSize.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoadingSpinnerSize.HERO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiLoadingSpinner$lambda$0(LoadingSpinner loadingSpinner, int i, Composer composer, int i2) {
        SduiLoadingSpinner(loadingSpinner, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final <ActionT extends Parcelable> void SduiLoadingSpinner(final LoadingSpinner<? extends ActionT> loadingSpinner, Composer composer, final int i) {
        int i2;
        BentoProgressIndicator3 bentoProgressIndicator3;
        Intrinsics.checkNotNullParameter(loadingSpinner, "loadingSpinner");
        Composer composerStartRestartGroup = composer.startRestartGroup(-632139528);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(loadingSpinner) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-632139528, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiLoadingSpinner (SduiLoadingSpinner.kt:12)");
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[loadingSpinner.getSize().ordinal()];
            if (i3 == 1) {
                bentoProgressIndicator3 = BentoProgressIndicator3.f5153XS;
            } else if (i3 == 2) {
                bentoProgressIndicator3 = BentoProgressIndicator3.XXS;
            } else if (i3 == 3) {
                bentoProgressIndicator3 = BentoProgressIndicator3.f5153XS;
            } else if (i3 == 4) {
                bentoProgressIndicator3 = BentoProgressIndicator3.f5151S;
            } else {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                bentoProgressIndicator3 = BentoProgressIndicator3.f5149L;
            }
            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, bentoProgressIndicator3, 0L, composerStartRestartGroup, 0, 5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiLoadingSpinnerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiLoadingSpinner2.SduiLoadingSpinner$lambda$0(loadingSpinner, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
