package com.robinhood.compose.bento.component;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyKey;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

/* compiled from: BentoIcon.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\"\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"/\u0010\u0016\u001a\u00020\u0012*\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d*\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, m3636d2 = {"BentoIcon", "", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "contentDescription", "", "tint", "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "useAssetSize", "", "BentoIcon-FU0evQE", "(Lcom/robinhood/compose/bento/component/BentoIcons;Ljava/lang/String;JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "BentoIconSemanticKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lcom/robinhood/compose/bento/component/BentoIconState;", "getBentoIconSemanticKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "<set-?>", "bentoIconKey", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "getBentoIconKey$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "getBentoIconKey", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lcom/robinhood/compose/bento/component/BentoIconState;", "setBentoIconKey", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lcom/robinhood/compose/bento/component/BentoIconState;)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoIconKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoIcon2 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BentoIcon2.class, "bentoIconKey", "getBentoIconKey(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lcom/robinhood/compose/bento/component/BentoIconState;", 1))};
    private static final SemanticsPropertyKey<BentoIconState> BentoIconSemanticKey = new SemanticsPropertyKey<>("BentoIconKey", null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoIcon_FU0evQE$lambda$5(BentoIcon4 bentoIcon4, String str, long j, Modifier modifier, Function0 function0, boolean z, int i, int i2, Composer composer, int i3) {
        m20644BentoIconFU0evQE(bentoIcon4, str, j, modifier, function0, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0136  */
    /* renamed from: BentoIcon-FU0evQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20644BentoIconFU0evQE(final BentoIcon4 icon, final String str, final long j, Modifier modifier, Function0<Unit> function0, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        int i5;
        boolean z2;
        Function0<Unit> function03;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z3;
        Object objRememberedValue2;
        Modifier modifier3;
        final Function0<Unit> function04;
        Modifier modifierM4891clickableO2vRcR0$default;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer composerStartRestartGroup = composer.startRestartGroup(-913428551);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    if ((i3 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        if (i6 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        function03 = i4 == 0 ? null : function02;
                        if (i5 != 0) {
                            z2 = false;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-913428551, i3, -1, "com.robinhood.compose.bento.component.BentoIcon (BentoIcon.kt:34)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = InteractionSource2.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Painter painterPainterResource = PainterResources_androidKt.painterResource(icon.getAsset().getResourceId(), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        int i7 = i3 & 112;
                        z3 = (i7 != 32) | ((i3 & 14) != 4);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z3 || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.compose.bento.component.BentoIconKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return BentoIcon2.BentoIcon_FU0evQE$lambda$2$lambda$1(icon, str, (SemanticsPropertyReceiver) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierWithBentoCirclePlaceholder$default = LocalShowPlaceholder.withBentoCirclePlaceholder$default(SemanticsModifier6.semantics$default(modifier2, false, (Function1) objRememberedValue2, 1, null), false, 1, null);
                        if (!z2) {
                            modifierWithBentoCirclePlaceholder$default = SizeKt.m5169size3ABfNKs(modifierWithBentoCirclePlaceholder$default, icon.mo20645getSizeD9Ej5fM());
                        }
                        modifier3 = modifierWithBentoCirclePlaceholder$default;
                        if (function03 != null && (modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifier3, interactionSource3, RippleKt.m5937rippleH2RKhps$default(false, icon.mo20645getSizeD9Ej5fM(), 0L, 4, null), false, null, Role.m7472boximpl(Role.INSTANCE.m7479getButtono7Vup1c()), function03, 12, null)) != null) {
                            modifier3 = modifierM4891clickableO2vRcR0$default;
                        }
                        IconKt.m5871Iconww6aTOc(painterPainterResource, str, modifier3, j, composerStartRestartGroup, i7 | ((i3 << 3) & 7168), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function04 = function03;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function04 = function02;
                    }
                    final Modifier modifier4 = modifier2;
                    final boolean z4 = z2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoIconKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoIcon2.BentoIcon_FU0evQE$lambda$5(icon, str, j, modifier4, function04, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                z2 = z;
                if ((i3 & 74899) == 74898) {
                    if (i6 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Painter painterPainterResource2 = PainterResources_androidKt.painterResource(icon.getAsset().getResourceId(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if ((i3 & 14) != 4) {
                    }
                    int i72 = i3 & 112;
                    z3 = (i72 != 32) | ((i3 & 14) != 4);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z3) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.compose.bento.component.BentoIconKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return BentoIcon2.BentoIcon_FU0evQE$lambda$2$lambda$1(icon, str, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierWithBentoCirclePlaceholder$default2 = LocalShowPlaceholder.withBentoCirclePlaceholder$default(SemanticsModifier6.semantics$default(modifier2, false, (Function1) objRememberedValue2, 1, null), false, 1, null);
                        if (!z2) {
                        }
                        modifier3 = modifierWithBentoCirclePlaceholder$default2;
                        if (function03 != null) {
                            modifier3 = modifierM4891clickableO2vRcR0$default;
                        }
                        IconKt.m5871Iconww6aTOc(painterPainterResource2, str, modifier3, j, composerStartRestartGroup, i72 | ((i3 << 3) & 7168), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function04 = function03;
                    }
                }
                final Modifier modifier42 = modifier2;
                final boolean z42 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            z2 = z;
            if ((i3 & 74899) == 74898) {
            }
            final Modifier modifier422 = modifier2;
            final boolean z422 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i3 & 74899) == 74898) {
        }
        final Modifier modifier4222 = modifier2;
        final boolean z4222 = z2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoIcon_FU0evQE$lambda$2$lambda$1(BentoIcon4 bentoIcon4, String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        setBentoIconKey(semantics, new BentoIconState(bentoIcon4, str));
        return Unit.INSTANCE;
    }

    public static final SemanticsPropertyKey<BentoIconState> getBentoIconSemanticKey() {
        return BentoIconSemanticKey;
    }

    private static final BentoIconState getBentoIconKey(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return BentoIconSemanticKey.getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    private static final void setBentoIconKey(SemanticsPropertyReceiver semanticsPropertyReceiver, BentoIconState bentoIconState) {
        BentoIconSemanticKey.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], bentoIconState);
    }
}
