package com.truelayer.payments.p419ui.screens.confirmation.components;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.EncircledProviderImage4;
import com.truelayer.payments.p419ui.utils.TestTags;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProviderToMerchantIcons.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m3636d2 = {"ProviderToMerchantIcons", "", "Landroidx/compose/foundation/layout/ColumnScope;", "merchantIconUrl", "", "providerIconUrl", "providerExtendedIconUrl", "regulated", "", "imageSize", "Landroidx/compose/ui/unit/Dp;", "joinerImageWidth", "ProviderToMerchantIcons-nbWgWpA", "(Landroidx/compose/foundation/layout/ColumnScope;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZFFLandroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.confirmation.components.ProviderToMerchantIconsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ProviderToMerchantIcons3 {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0164  */
    /* renamed from: ProviderToMerchantIcons-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m27094ProviderToMerchantIconsnbWgWpA(final Column5 ProviderToMerchantIcons, final String merchantIconUrl, final String providerIconUrl, final String str, final boolean z, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        int i4;
        float f3;
        int i5;
        float f4;
        int i6;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(ProviderToMerchantIcons, "$this$ProviderToMerchantIcons");
        Intrinsics.checkNotNullParameter(merchantIconUrl, "merchantIconUrl");
        Intrinsics.checkNotNullParameter(providerIconUrl, "providerIconUrl");
        Composer composerStartRestartGroup = composer.startRestartGroup(-919565254);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(ProviderToMerchantIcons) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(merchantIconUrl) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(providerIconUrl) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 7168) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
            }
            if ((i2 & 8) == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((458752 & i) == 0) {
                    f3 = f;
                    i3 |= composerStartRestartGroup.changed(f3) ? 131072 : 65536;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((3670016 & i) == 0) {
                        f4 = f2;
                        i3 |= composerStartRestartGroup.changed(f4) ? 1048576 : 524288;
                    }
                    i6 = i3;
                    if ((2995931 & i6) != 599186 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        f5 = f3;
                    } else {
                        float fM7995constructorimpl = i4 == 0 ? C2002Dp.m7995constructorimpl(64) : f3;
                        float fM7995constructorimpl2 = i5 == 0 ? C2002Dp.m7995constructorimpl(144) : f4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-919565254, i6, -1, "com.truelayer.payments.ui.screens.confirmation.components.ProviderToMerchantIcons (ProviderToMerchantIcons.kt:26)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Modifier modifierAlign = ProviderToMerchantIcons.align(companion, companion2.getCenterHorizontally());
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlign);
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        Row6 row6 = Row6.INSTANCE;
                        int i7 = (i6 >> 12) & 112;
                        int i8 = i6 << 3;
                        EncircledProviderImage4.m27039EncircledProviderImageRfXq3Jk(row6.align(companion, companion2.getCenterVertically()), fM7995constructorimpl, str2, providerIconUrl, null, null, composerStartRestartGroup, ((i6 >> 3) & 896) | i7 | (i8 & 7168), 48);
                        float f6 = fM7995constructorimpl;
                        composerStartRestartGroup = composerStartRestartGroup;
                        f4 = fM7995constructorimpl2;
                        ImageKt.Image(PainterResources_androidKt.painterResource(!z ? C42830R.drawable.ic_joiner_regulated : C42830R.drawable.ic_joiner_tl_logo, composerStartRestartGroup, 0), (String) null, TestTag3.testTag(row6.align(SizeKt.m5174width3ABfNKs(companion, fM7995constructorimpl2), companion2.getCenterVertically()), !z ? TestTags.REGULATED_CONNECT_ICON : TestTags.BRANDED_CONNECT_ICON), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        EncircledProviderImage4.m27039EncircledProviderImageRfXq3Jk(row6.align(companion, companion2.getCenterVertically()), f6, merchantIconUrl, merchantIconUrl, ProviderToMerchantIcons.INSTANCE.m27093getLambda1$payments_ui_release(), null, composerStartRestartGroup, i7 | 24576 | (i8 & 896) | ((i6 << 6) & 7168), 32);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f5 = f6;
                    }
                    final float f7 = f4;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.components.ProviderToMerchantIconsKt$ProviderToMerchantIcons$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i9) {
                                ProviderToMerchantIcons3.m27094ProviderToMerchantIconsnbWgWpA(ProviderToMerchantIcons, merchantIconUrl, providerIconUrl, str, z, f5, f7, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                f4 = f2;
                i6 = i3;
                if ((2995931 & i6) != 599186) {
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Alignment.Companion companion22 = Alignment.INSTANCE;
                    Modifier modifierAlign2 = ProviderToMerchantIcons.align(companion4, companion22.getCenterHorizontally());
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion22.getTop(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierAlign2);
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        Row6 row62 = Row6.INSTANCE;
                        int i72 = (i6 >> 12) & 112;
                        int i82 = i6 << 3;
                        EncircledProviderImage4.m27039EncircledProviderImageRfXq3Jk(row62.align(companion4, companion22.getCenterVertically()), fM7995constructorimpl, str2, providerIconUrl, null, null, composerStartRestartGroup, ((i6 >> 3) & 896) | i72 | (i82 & 7168), 48);
                        float f62 = fM7995constructorimpl;
                        composerStartRestartGroup = composerStartRestartGroup;
                        f4 = fM7995constructorimpl2;
                        ImageKt.Image(PainterResources_androidKt.painterResource(!z ? C42830R.drawable.ic_joiner_regulated : C42830R.drawable.ic_joiner_tl_logo, composerStartRestartGroup, 0), (String) null, TestTag3.testTag(row62.align(SizeKt.m5174width3ABfNKs(companion4, fM7995constructorimpl2), companion22.getCenterVertically()), !z ? TestTags.REGULATED_CONNECT_ICON : TestTags.BRANDED_CONNECT_ICON), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        EncircledProviderImage4.m27039EncircledProviderImageRfXq3Jk(row62.align(companion4, companion22.getCenterVertically()), f62, merchantIconUrl, merchantIconUrl, ProviderToMerchantIcons.INSTANCE.m27093getLambda1$payments_ui_release(), null, composerStartRestartGroup, i72 | 24576 | (i82 & 896) | ((i6 << 6) & 7168), 32);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        f5 = f62;
                    }
                }
                final float f72 = f4;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f3 = f;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            f4 = f2;
            i6 = i3;
            if ((2995931 & i6) != 599186) {
            }
            final float f722 = f4;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str2 = str;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f3 = f;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        f4 = f2;
        i6 = i3;
        if ((2995931 & i6) != 599186) {
        }
        final float f7222 = f4;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
