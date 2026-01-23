package com.truelayer.payments.p419ui.components;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.p419ui.screens.providerselection.PaymentProviderViewData;
import com.truelayer.payments.p419ui.theme.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EncircledProviderImage.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a.\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001an\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0002\b\u000f2\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0002\b\u000fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001a\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "size", "Lcom/truelayer/payments/ui/screens/providerselection/PaymentProviderViewData;", "provider", "", "EncircledProviderImage-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLcom/truelayer/payments/ui/screens/providerselection/PaymentProviderViewData;Landroidx/compose/runtime/Composer;II)V", "EncircledProviderImage", "", "extendedIconUri", "iconUri", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Lkotlin/ExtensionFunctionType;", "errorView", "loading", "EncircledProviderImage-RfXq3Jk", "(Landroidx/compose/ui/Modifier;FLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "paddingForSquareFitIntoCircle-0680j_4", "(F)F", "paddingForSquareFitIntoCircle", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.components.EncircledProviderImageKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class EncircledProviderImage4 {
    /* renamed from: EncircledProviderImage-uFdPcIQ, reason: not valid java name */
    public static final void m27040EncircledProviderImageuFdPcIQ(Modifier modifier, float f, final PaymentProviderViewData provider, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Composer composerStartRestartGroup = composer.startRestartGroup(1318468332);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        final Modifier modifier2 = modifier;
        if ((i2 & 2) != 0) {
            f = C2002Dp.m7995constructorimpl(58);
        }
        final float f2 = f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1318468332, i, -1, "com.truelayer.payments.ui.components.EncircledProviderImage (EncircledProviderImage.kt:22)");
        }
        m27039EncircledProviderImageRfXq3Jk(modifier2, f2, provider.getExtendedIcon(), provider.getIconUri(), null, null, composerStartRestartGroup, i & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.EncircledProviderImageKt$EncircledProviderImage$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    EncircledProviderImage4.m27040EncircledProviderImageuFdPcIQ(modifier2, f2, provider, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* renamed from: EncircledProviderImage-RfXq3Jk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m27039EncircledProviderImageRfXq3Jk(Modifier modifier, float f, final String str, final String iconUri, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        int i4;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function33;
        int i5;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function34;
        final Modifier modifier3;
        final float fM7995constructorimpl;
        String str2;
        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function35;
        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function36;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(iconUri, "iconUri");
        Composer composerStartRestartGroup = composer.startRestartGroup(973715852);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= composerStartRestartGroup.changed(iconUri) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 57344) == 0) {
                    function33 = function3;
                    i3 |= composerStartRestartGroup.changedInstance(function33) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((i & 458752) == 0) {
                        function34 = function32;
                        i3 |= composerStartRestartGroup.changedInstance(function34) ? 131072 : 65536;
                    }
                    if ((i3 & 374491) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        fM7995constructorimpl = i7 == 0 ? C2002Dp.m7995constructorimpl(58) : f2;
                        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3M27027getLambda1$payments_ui_release = i4 == 0 ? EncircledProviderImage.INSTANCE.m27027getLambda1$payments_ui_release() : function33;
                        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3M27028getLambda2$payments_ui_release = i5 == 0 ? EncircledProviderImage.INSTANCE.m27028getLambda2$payments_ui_release() : function34;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(973715852, i3, -1, "com.truelayer.payments.ui.components.EncircledProviderImage (EncircledProviderImage.kt:43)");
                        }
                        Modifier modifierM27165circlesqb8OZA$default = ModifiersKt.m27165circlesqb8OZA$default(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, fM7995constructorimpl), 0L, 0.0f, null, 7, null);
                        if (str != null) {
                            modifierM27165circlesqb8OZA$default = PaddingKt.m5142padding3ABfNKs(modifierM27165circlesqb8OZA$default, m27041paddingForSquareFitIntoCircle0680j_4(fM7995constructorimpl));
                            str2 = iconUri;
                        } else {
                            str2 = str;
                        }
                        SvgImage4.SvgImage(modifierM27165circlesqb8OZA$default.then(modifier3), str2, null, null, function3M27028getLambda2$payments_ui_release, function3M27027getLambda1$payments_ui_release, composerStartRestartGroup, ((i3 >> 3) & 57344) | ((i3 << 3) & 458752), 12);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function35 = function3M27028getLambda2$payments_ui_release;
                        function36 = function3M27027getLambda1$payments_ui_release;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        fM7995constructorimpl = f2;
                        function36 = function33;
                        function35 = function34;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.EncircledProviderImageKt$EncircledProviderImage$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i8) {
                                EncircledProviderImage4.m27039EncircledProviderImageRfXq3Jk(modifier3, fM7995constructorimpl, str, iconUri, function36, function35, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                function34 = function32;
                if ((i3 & 374491) == 74898) {
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierM27165circlesqb8OZA$default2 = ModifiersKt.m27165circlesqb8OZA$default(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, fM7995constructorimpl), 0L, 0.0f, null, 7, null);
                    if (str != null) {
                    }
                    SvgImage4.SvgImage(modifierM27165circlesqb8OZA$default2.then(modifier3), str2, null, null, function3M27028getLambda2$payments_ui_release, function3M27027getLambda1$payments_ui_release, composerStartRestartGroup, ((i3 >> 3) & 57344) | ((i3 << 3) & 458752), 12);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function35 = function3M27028getLambda2$payments_ui_release;
                    function36 = function3M27027getLambda1$payments_ui_release;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function33 = function3;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            function34 = function32;
            if ((i3 & 374491) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        f2 = f;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function33 = function3;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        function34 = function32;
        if ((i3 & 374491) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: paddingForSquareFitIntoCircle-0680j_4, reason: not valid java name */
    public static final float m27041paddingForSquareFitIntoCircle0680j_4(float f) {
        float f2 = 2;
        float fSqrt = (((float) Math.sqrt((f * f) * f2)) / f2) - (f / f2);
        return C2002Dp.m7995constructorimpl((float) Math.sqrt((fSqrt * fSqrt) / f2));
    }
}
