package com.robinhood.android.retirement.lib.rollover401k;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Rollover401kHeaderImage.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f²\u0006\f\u0010\r\u001a\u0004\u0018\u00010\tX\u008a\u008e\u0002"}, m3636d2 = {"RolloverHeaderImage", "", MarkdownText4.TagImageUrl, "", "onBackPressed", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "heightWhileImageLoading", "Landroidx/compose/ui/unit/Dp;", "RolloverHeaderImage-IColEu4", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/unit/Dp;Landroidx/compose/runtime/Composer;II)V", "lib-retirement_externalDebug", "defaultMinHeight"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.lib.rollover401k.Rollover401kHeaderImageKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Rollover401kHeaderImage3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RolloverHeaderImage_IColEu4$lambda$3(String str, Function0 function0, Modifier modifier, C2002Dp c2002Dp, int i, int i2, Composer composer, int i3) {
        m18135RolloverHeaderImageIColEu4(str, function0, modifier, c2002Dp, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* renamed from: RolloverHeaderImage-IColEu4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m18135RolloverHeaderImageIColEu4(final String imageUrl, final Function0<Unit> onBackPressed, Modifier modifier, C2002Dp c2002Dp, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        C2002Dp c2002Dp2;
        Object objRememberedValue;
        final C2002Dp c2002Dp3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1979981163);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(imageUrl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    c2002Dp2 = c2002Dp;
                    i3 |= composerStartRestartGroup.changed(c2002Dp2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    C2002Dp c2002Dp4 = i4 == 0 ? null : c2002Dp2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1979981163, i3, -1, "com.robinhood.android.retirement.lib.rollover401k.RolloverHeaderImage (Rollover401kHeaderImage.kt:37)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(c2002Dp4, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Boolean bool = Boolean.TRUE;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-96365491, true, new Rollover401kHeaderImage4(modifier4, (SnapshotState) objRememberedValue, imageUrl, onBackPressed), composerStartRestartGroup, 54);
                    C2002Dp c2002Dp5 = c2002Dp4;
                    Modifier modifier5 = modifier4;
                    BentoTheme2.BentoTheme(bool, null, null, null, null, null, null, null, composableLambdaRememberComposableLambda, composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    c2002Dp3 = c2002Dp5;
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    c2002Dp3 = c2002Dp2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.lib.rollover401k.Rollover401kHeaderImageKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Rollover401kHeaderImage3.RolloverHeaderImage_IColEu4$lambda$3(imageUrl, onBackPressed, modifier3, c2002Dp3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            c2002Dp2 = c2002Dp;
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Boolean bool2 = Boolean.TRUE;
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-96365491, true, new Rollover401kHeaderImage4(modifier4, (SnapshotState) objRememberedValue, imageUrl, onBackPressed), composerStartRestartGroup, 54);
                C2002Dp c2002Dp52 = c2002Dp4;
                Modifier modifier52 = modifier4;
                BentoTheme2.BentoTheme(bool2, null, null, null, null, null, null, null, composableLambdaRememberComposableLambda2, composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                }
                c2002Dp3 = c2002Dp52;
                modifier3 = modifier52;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        c2002Dp2 = c2002Dp;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2002Dp RolloverHeaderImage_IColEu4$lambda$1(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue();
    }
}
