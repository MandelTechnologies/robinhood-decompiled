package com.robinhood.compose.bento.component;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.plt.PltModifiers;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoProgressIndicator.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a-\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"BentoCircularProgressIndicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "progressBarSize", "Lcom/robinhood/compose/bento/component/CircularProgressIndicatorSize;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "BentoCircularProgressIndicator-FNF3uiM", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/CircularProgressIndicatorSize;JLandroidx/compose/runtime/Composer;II)V", BentoProgressIndicator2.BentoCircularProgressIndicatorTestTag, "", "getBentoCircularProgressIndicatorTestTag$annotations", "()V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoProgressIndicatorKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoProgressIndicator2 {
    public static final String BentoCircularProgressIndicatorTestTag = "BentoCircularProgressIndicatorTestTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoCircularProgressIndicator_FNF3uiM$lambda$0(Modifier modifier, BentoProgressIndicator3 bentoProgressIndicator3, long j, int i, int i2, Composer composer, int i3) {
        m20700BentoCircularProgressIndicatorFNF3uiM(modifier, bentoProgressIndicator3, j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getBentoCircularProgressIndicatorTestTag$annotations() {
    }

    /* renamed from: BentoCircularProgressIndicator-FNF3uiM, reason: not valid java name */
    public static final void m20700BentoCircularProgressIndicatorFNF3uiM(Modifier modifier, BentoProgressIndicator3 bentoProgressIndicator3, long j, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long jM21745getColor0d7_KjU;
        final Modifier modifier3;
        BentoProgressIndicator3 bentoProgressIndicator32;
        final BentoProgressIndicator3 bentoProgressIndicator33;
        final long j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1097087877);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(bentoProgressIndicator3 == null ? -1 : bentoProgressIndicator3.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                jM21745getColor0d7_KjU = j;
                int i6 = composerStartRestartGroup.changed(jM21745getColor0d7_KjU) ? 256 : 128;
                i3 |= i6;
            } else {
                jM21745getColor0d7_KjU = j;
            }
            i3 |= i6;
        } else {
            jM21745getColor0d7_KjU = j;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                bentoProgressIndicator32 = i5 != 0 ? BentoProgressIndicator3.f5150M : bentoProgressIndicator3;
                if ((i2 & 4) != 0) {
                    jM21745getColor0d7_KjU = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getCircularProgressIndicator(composerStartRestartGroup, 0).m21745getColor0d7_KjU();
                    i3 &= -897;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                modifier3 = modifier2;
                bentoProgressIndicator32 = bentoProgressIndicator3;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1097087877, i3, -1, "com.robinhood.compose.bento.component.BentoCircularProgressIndicator (BentoProgressIndicator.kt:21)");
            }
            long j3 = jM21745getColor0d7_KjU;
            ProgressIndicatorKt.m5922CircularProgressIndicatorLxG7B9w(PltModifiers.recordLoadingState$default(TestTag3.testTag(SizeKt.m5169size3ABfNKs(modifier3, bentoProgressIndicator32.getSize()), BentoCircularProgressIndicatorTestTag), true, null, 2, null), j3, bentoProgressIndicator32.getStrokeWidth(), 0L, 0, composerStartRestartGroup, (i3 >> 3) & 112, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            bentoProgressIndicator33 = bentoProgressIndicator32;
            j2 = j3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            bentoProgressIndicator33 = bentoProgressIndicator3;
            modifier3 = modifier2;
            j2 = jM21745getColor0d7_KjU;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoProgressIndicatorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoProgressIndicator2.BentoCircularProgressIndicator_FNF3uiM$lambda$0(modifier3, bentoProgressIndicator33, j2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
