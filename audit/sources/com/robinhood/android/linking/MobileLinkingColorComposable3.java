package com.robinhood.android.linking;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MobileLinkingColorComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"MobileLinkingColorComposable", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "type", "Lcom/robinhood/android/linking/MobileLinkingColorComposableType;", "MobileLinkingColorComposable-KTwxG1Y", "(JLandroidx/compose/ui/Modifier;Lcom/robinhood/android/linking/MobileLinkingColorComposableType;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "lib-mobile-linking_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.linking.MobileLinkingColorComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MobileLinkingColorComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MobileLinkingColorComposable_KTwxG1Y$lambda$0(long j, Modifier modifier, MobileLinkingColorComposable4 mobileLinkingColorComposable4, int i, int i2, Composer composer, int i3) {
        m16071MobileLinkingColorComposableKTwxG1Y(j, modifier, mobileLinkingColorComposable4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$1(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* renamed from: MobileLinkingColorComposable-KTwxG1Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m16071MobileLinkingColorComposableKTwxG1Y(final long j, Modifier modifier, MobileLinkingColorComposable4 mobileLinkingColorComposable4, Composer composer, final int i, final int i2) {
        long j2;
        int i3;
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        final MobileLinkingColorComposable4 mobileLinkingColorComposable42;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2068040602);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(j2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(mobileLinkingColorComposable4 == null ? -1 : mobileLinkingColorComposable4.ordinal()) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                MobileLinkingColorComposable4 mobileLinkingColorComposable43 = i4 == 0 ? MobileLinkingColorComposable4.LARGE : mobileLinkingColorComposable4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2068040602, i3, -1, "com.robinhood.android.linking.MobileLinkingColorComposable (MobileLinkingColorComposable.kt:31)");
                }
                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Clip.clip(PaddingKt.m5142padding3ABfNKs(Background3.background$default(SizeKt.m5169size3ABfNKs(modifier4, mobileLinkingColorComposable43.getTotalSize()), Brush.Companion.m6680radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(j2, 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())}), 0L, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), mobileLinkingColorComposable43.getGradientRadius()), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(2))), j, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                mobileLinkingColorComposable42 = mobileLinkingColorComposable43;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                mobileLinkingColorComposable42 = mobileLinkingColorComposable4;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.linking.MobileLinkingColorComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MobileLinkingColorComposable3.MobileLinkingColorComposable_KTwxG1Y$lambda$0(j, modifier3, mobileLinkingColorComposable42, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Clip.clip(PaddingKt.m5142padding3ABfNKs(Background3.background$default(SizeKt.m5169size3ABfNKs(modifier4, mobileLinkingColorComposable43.getTotalSize()), Brush.Companion.m6680radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(j2, 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())}), 0L, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), mobileLinkingColorComposable43.getGradientRadius()), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(2))), j, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
            mobileLinkingColorComposable42 = mobileLinkingColorComposable43;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1557815768);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1557815768, i, -1, "com.robinhood.android.linking.Preview (MobileLinkingColorComposable.kt:51)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, MobileLinkingColorComposable.INSTANCE.getLambda$890149744$lib_mobile_linking_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.linking.MobileLinkingColorComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MobileLinkingColorComposable3.Preview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
