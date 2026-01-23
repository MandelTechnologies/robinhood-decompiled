package com.robinhood.compose.bento.component.alerts;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoAlertSheet.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000e\u001a\u0015\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"BentoAlertSheet", "", "title", "", CarResultComposable2.BODY, WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;", WiresInvalidAccountContentComposable.SecondaryButtonTag, "pictogram", "Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", ResourceTypes.STYLE, "Lcom/robinhood/compose/bento/component/alerts/BentoBottomSheetStyle;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;Lcom/robinhood/compose/bento/component/alerts/BentoBottomSheetStyle;Landroidx/compose/runtime/Composer;II)V", "BentoAlertSheetPreviewDay", "(Landroidx/compose/runtime/Composer;I)V", "BentoAlertSheetPreviewNight", "BentoAlertPreviews", "isDay", "", "(ZLandroidx/compose/runtime/Composer;I)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.alerts.BentoAlertSheetKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoAlertSheet {

    /* compiled from: BentoAlertSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.alerts.BentoAlertSheetKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BentoAlertSheet3.values().length];
            try {
                iArr[BentoAlertSheet3.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAlertPreviews$lambda$4(boolean z, int i, Composer composer, int i2) {
        BentoAlertPreviews(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAlertSheet$lambda$1(String str, String str2, BentoAlertButton bentoAlertButton, BentoAlertButton bentoAlertButton2, ServerToBentoAssetMapper3 serverToBentoAssetMapper3, BentoAlertSheet3 bentoAlertSheet3, int i, int i2, Composer composer, int i3) {
        BentoAlertSheet(str, str2, bentoAlertButton, bentoAlertButton2, serverToBentoAssetMapper3, bentoAlertSheet3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAlertSheetPreviewDay$lambda$2(int i, Composer composer, int i2) {
        BentoAlertSheetPreviewDay(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAlertSheetPreviewNight$lambda$3(int i, Composer composer, int i2) {
        BentoAlertSheetPreviewNight(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6 A[PHI: r9
      0x00a6: PHI (r9v15 int) = (r9v0 int), (r9v5 int), (r9v6 int) binds: [B:58:0x00a4, B:68:0x00bc, B:67:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoAlertSheet(final String title, final String body, final BentoAlertButton primaryButton, BentoAlertButton bentoAlertButton, ServerToBentoAssetMapper3 serverToBentoAssetMapper3, BentoAlertSheet3 bentoAlertSheet3, Composer composer, final int i, final int i2) {
        int i3;
        final BentoAlertButton bentoAlertButton2;
        int i4;
        int i5;
        BentoAlertSheet3 bentoAlertSheet32;
        long jM21372getBg20d7_KjU;
        final ServerToBentoAssetMapper3 serverToBentoAssetMapper32;
        final BentoAlertSheet3 bentoAlertSheet33;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Composer composerStartRestartGroup = composer.startRestartGroup(1063627852);
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
            i3 |= composerStartRestartGroup.changed(body) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(primaryButton) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                bentoAlertButton2 = bentoAlertButton;
                i3 |= composerStartRestartGroup.changed(bentoAlertButton2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(serverToBentoAssetMapper3 == null ? -1 : serverToBentoAssetMapper3.ordinal()) ? 16384 : 8192;
            }
            i5 = i2 & 32;
            int i7 = 196608;
            if (i5 != 0) {
                i3 |= i7;
            } else if ((196608 & i) == 0) {
                i7 = composerStartRestartGroup.changed(bentoAlertSheet3 == null ? -1 : bentoAlertSheet3.ordinal()) ? 131072 : 65536;
                i3 |= i7;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                BentoAlertButton bentoAlertButton3 = i6 == 0 ? null : bentoAlertButton2;
                ServerToBentoAssetMapper3 serverToBentoAssetMapper33 = i4 == 0 ? null : serverToBentoAssetMapper3;
                bentoAlertSheet32 = i5 == 0 ? BentoAlertSheet3.NEUTRAL : bentoAlertSheet3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1063627852, i3, -1, "com.robinhood.compose.bento.component.alerts.BentoAlertSheet (BentoAlertSheet.kt:33)");
                }
                if (WhenMappings.$EnumSwitchMapping$0[bentoAlertSheet32.ordinal()] == 1) {
                    throw new NoWhenBranchMatchedException();
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composerStartRestartGroup, 6).m21371getBg0d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(1)), 0.0f, 1, null);
                if (bentoTheme.getColors(composerStartRestartGroup, 6).getIsDay()) {
                    composerStartRestartGroup.startReplaceGroup(-265260151);
                    jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, 6).getJet();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-265259287);
                    jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, 6).m21372getBg20d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, jM21372getBg20d7_KjU, null, 2, null), composerStartRestartGroup, 0);
                ServerToBentoAssetMapper3 serverToBentoAssetMapper34 = serverToBentoAssetMapper33;
                BentoAlerts2.AlertContent(null, serverToBentoAssetMapper34, title, null, CollectionsKt.listOfNotNull((Object[]) new BentoAlertButton[]{primaryButton, bentoAlertButton3}), false, ComposableLambda3.rememberComposableLambda(1228514166, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertSheetKt$BentoAlertSheet$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        if ((i8 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1228514166, i8, -1, "com.robinhood.compose.bento.component.alerts.BentoAlertSheet.<anonymous>.<anonymous> (BentoAlertSheet.kt:52)");
                        }
                        BentoAlerts2.m20854AlertBodyText5stqomU(body, 0, composer2, 0, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 112) | 1572864 | ((i3 << 6) & 896), 41);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                serverToBentoAssetMapper32 = serverToBentoAssetMapper34;
                bentoAlertButton2 = bentoAlertButton3;
                bentoAlertSheet33 = bentoAlertSheet32;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                serverToBentoAssetMapper32 = serverToBentoAssetMapper3;
                bentoAlertSheet33 = bentoAlertSheet3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoAlertSheet.BentoAlertSheet$lambda$1(title, body, primaryButton, bentoAlertButton2, serverToBentoAssetMapper32, bentoAlertSheet33, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        bentoAlertButton2 = bentoAlertButton;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i2 & 32;
        int i72 = 196608;
        if (i5 != 0) {
        }
        if ((74899 & i3) == 74898) {
            if (i6 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$0[bentoAlertSheet32.ordinal()] == 1) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void BentoAlertSheetPreviewDay(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-899364723);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-899364723, i, -1, "com.robinhood.compose.bento.component.alerts.BentoAlertSheetPreviewDay (BentoAlertSheet.kt:73)");
            }
            BentoAlertPreviews(true, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoAlertSheet.BentoAlertSheetPreviewDay$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoAlertSheetPreviewNight(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1633001135);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1633001135, i, -1, "com.robinhood.compose.bento.component.alerts.BentoAlertSheetPreviewNight (BentoAlertSheet.kt:79)");
            }
            BentoAlertPreviews(false, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoAlertSheet.BentoAlertSheetPreviewNight$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoAlertPreviews(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1980442243);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1980442243, i2, -1, "com.robinhood.compose.bento.component.alerts.BentoAlertPreviews (BentoAlertSheet.kt:84)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(z), null, null, null, null, null, null, null, BentoAlertSheet4.INSTANCE.m20861getLambda$1181175861$lib_compose_bento_externalRelease(), composerStartRestartGroup, (i2 & 14) | 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoAlertSheet.BentoAlertPreviews$lambda$4(z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
