package com.robinhood.android.lib.accountswitcher;

import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherCta;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagDefaults;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountSwitcherCta.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001ak\u0010\u0000\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"AccountSwitcherCta", "", "state", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCtaState;", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "(Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCtaState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "title", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "leadingIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "loading", "", "minHeight", "Landroidx/compose/ui/unit/Dp;", "enableAccountSwitching", "showBadge", "AccountSwitcherCta-GmEhDVc", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ZFZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-account-switcher_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.accountswitcher.AccountSwitcherCtaKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class AccountSwitcherCta {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSwitcherCta$lambda$0(AccountSwitcherCtaState accountSwitcherCtaState, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        AccountSwitcherCta(accountSwitcherCtaState, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSwitcherCta_GmEhDVc$lambda$1(String str, TextStyle textStyle, Modifier modifier, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, float f, boolean z2, boolean z3, Function0 function0, int i, int i2, Composer composer, int i3) {
        m15801AccountSwitcherCtaGmEhDVc(str, textStyle, modifier, serverToBentoAssetMapper2, z, f, z2, z3, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSwitcherCta(final AccountSwitcherCtaState state, Modifier modifier, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1337633789);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1337633789, i3, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcherCta (AccountSwitcherCta.kt:48)");
                }
                modifier3 = modifier4;
                SurfaceKt.m5967SurfaceT9BRK9s(ClickableKt.m4893clickableXHw0xAI$default(ModifiersKt.bentoPillPlaceholder(Clip.clip(modifier4, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(InfoTagDefaults.INSTANCE.m20818getShapeRadiusD9Ej5fM())), state.getLoading()), state.getLoading() && state.getEnableAccountSwitching(), null, null, onClick, 6, null), null, Color.INSTANCE.m6725getTransparent0d7_KjU(), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(107393752, true, new C201921(state), composerStartRestartGroup, 54), composerStartRestartGroup, 12583296, 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherCtaKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountSwitcherCta.AccountSwitcherCta$lambda$0(state, modifier3, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (state.getLoading()) {
                modifier3 = modifier4;
                SurfaceKt.m5967SurfaceT9BRK9s(ClickableKt.m4893clickableXHw0xAI$default(ModifiersKt.bentoPillPlaceholder(Clip.clip(modifier4, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(InfoTagDefaults.INSTANCE.m20818getShapeRadiusD9Ej5fM())), state.getLoading()), state.getLoading() && state.getEnableAccountSwitching(), null, null, onClick, 6, null), null, Color.INSTANCE.m6725getTransparent0d7_KjU(), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(107393752, true, new C201921(state), composerStartRestartGroup, 54), composerStartRestartGroup, 12583296, 114);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: AccountSwitcherCta.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lib.accountswitcher.AccountSwitcherCtaKt$AccountSwitcherCta$1 */
    static final class C201921 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AccountSwitcherCtaState $state;

        C201921(AccountSwitcherCtaState accountSwitcherCtaState) {
            this.$state = accountSwitcherCtaState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(long j, DrawScope Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            DrawScope.m6947drawCircleVaOC9Bg$default(Canvas, j, 0.0f, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            int i2;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(107393752, i, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcherCta.<anonymous> (AccountSwitcherCta.kt:60)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(companion, 0.0f, this.$state.m15805getMinHeightD9Ej5fM(), 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierM5155defaultMinSizeVpY3zN4$default, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement.Horizontal horizontalM5090spacedByD5KLDUw = Arrangement.INSTANCE.m5090spacedByD5KLDUw(bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), companion2.getCenterHorizontally());
            AccountSwitcherCtaState accountSwitcherCtaState = this.$state;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalM5090spacedByD5KLDUw, centerVertically, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composer.startReplaceGroup(1950749616);
            if (accountSwitcherCtaState.getLeadingIcon() != null) {
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(accountSwitcherCtaState.getLeadingIcon()), null, bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable | 48, 56);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(accountSwitcherCtaState.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, accountSwitcherCtaState.getTextStyle(), composer, 0, 0, 8190);
            composer.startReplaceGroup(1950761753);
            if (accountSwitcherCtaState.getEnableAccountSwitching()) {
                i2 = i3;
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_DOWN_16), null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
            } else {
                i2 = i3;
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(1950770479);
            if (accountSwitcherCtaState.getShowBadge()) {
                final long prime = bentoTheme.getColors(composer, i2).getPrime();
                Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(8));
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(prime);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherCtaKt$AccountSwitcherCta$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountSwitcherCta.C201921.invoke$lambda$2$lambda$1$lambda$0(prime, (DrawScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Canvas2.Canvas(modifierM5169size3ABfNKs, (Function1) objRememberedValue, composer, 6);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107  */
    /* renamed from: AccountSwitcherCta-GmEhDVc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15801AccountSwitcherCtaGmEhDVc(final String title, final TextStyle textStyle, Modifier modifier, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, float f, boolean z2, boolean z3, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        boolean z4;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        final boolean z5;
        final boolean z6;
        final float f3;
        final boolean z7;
        final ServerToBentoAssetMapper2 serverToBentoAssetMapper22;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(639129560);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(serverToBentoAssetMapper2 == null ? -1 : serverToBentoAssetMapper2.ordinal()) ? 2048 : 1024;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z4 = z;
                    i3 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        i3 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
                    }
                    if ((i2 & 256) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(onClick) ? 67108864 : 33554432;
                    }
                    i9 = i3;
                    if ((38347923 & i9) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper23 = i4 == 0 ? null : serverToBentoAssetMapper2;
                        boolean z8 = i5 == 0 ? false : z4;
                        float fM8004getUnspecifiedD9Ej5fM = i6 == 0 ? C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM() : f2;
                        boolean z9 = i7 == 0 ? true : z2;
                        boolean z10 = i8 == 0 ? false : z3;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(639129560, i9, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcherCta (AccountSwitcherCta.kt:113)");
                        }
                        Modifier modifier5 = modifier4;
                        AccountSwitcherCta(new AccountSwitcherCtaState(title, textStyle, serverToBentoAssetMapper23, z8, fM8004getUnspecifiedD9Ej5fM, z9, z10, null), modifier5, onClick, composerStartRestartGroup, ((i9 >> 3) & 112) | ((i9 >> 18) & 896), 0);
                        composer2 = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z10;
                        z6 = z9;
                        f3 = fM8004getUnspecifiedD9Ej5fM;
                        z7 = z8;
                        serverToBentoAssetMapper22 = serverToBentoAssetMapper23;
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
                        z6 = z2;
                        z5 = z3;
                        modifier3 = modifier2;
                        composer2 = composerStartRestartGroup;
                        z7 = z4;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherCtaKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AccountSwitcherCta.AccountSwitcherCta_GmEhDVc$lambda$1(title, textStyle, modifier3, serverToBentoAssetMapper22, z7, f3, z6, z5, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                f2 = f;
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                i9 = i3;
                if ((38347923 & i9) == 38347922) {
                    if (i10 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier52 = modifier4;
                    AccountSwitcherCta(new AccountSwitcherCtaState(title, textStyle, serverToBentoAssetMapper23, z8, fM8004getUnspecifiedD9Ej5fM, z9, z10, null), modifier52, onClick, composerStartRestartGroup, ((i9 >> 3) & 112) | ((i9 >> 18) & 896), 0);
                    composer2 = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z10;
                    z6 = z9;
                    f3 = fM8004getUnspecifiedD9Ej5fM;
                    z7 = z8;
                    serverToBentoAssetMapper22 = serverToBentoAssetMapper23;
                    modifier3 = modifier52;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z4 = z;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            f2 = f;
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i9 = i3;
            if ((38347923 & i9) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z4 = z;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        f2 = f;
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i9 = i3;
        if ((38347923 & i9) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
