package com.robinhood.android.crypto.p094ui.view;

import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.models.serverdriven.p347db.BannerComponent;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoDetailTransferActionsComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"CryptoDetailTransferActionsComposable", "", "state", "Lcom/robinhood/android/crypto/ui/view/CryptoDetailTransferActionState;", "onBannerAction", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "onButtonAction", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/crypto/ui/view/CryptoDetailTransferActionState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.view.CryptoDetailTransferActionsComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoDetailTransferActionsComposable2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoDetailTransferActionsComposable$lambda$6(CryptoDetailTransferActionState cryptoDetailTransferActionState, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoDetailTransferActionsComposable(cryptoDetailTransferActionState, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoDetailTransferActionsComposable(final CryptoDetailTransferActionState state, final Function1<? super GenericAction, Unit> onBannerAction, final Function1<? super GenericAction, Unit> onButtonAction, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        Arrangement arrangement;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        ImmutableList<UIComponent<com.robinhood.models.serverdriven.experimental.api.GenericAction>> transferBannerV2;
        Arrangement arrangement2;
        int i5;
        Modifier modifier4;
        int i6;
        int i7;
        BannerComponent transferBanner;
        Function0 function0;
        Uri uri;
        ImmutableList<UIComponent<com.robinhood.models.serverdriven.experimental.api.GenericAction>> transferButtonsV2;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onBannerAction, "onBannerAction");
        Intrinsics.checkNotNullParameter(onButtonAction, "onButtonAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1014490953);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBannerAction) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onButtonAction) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1014490953, i3, -1, "com.robinhood.android.crypto.ui.view.CryptoDetailTransferActionsComposable (CryptoDetailTransferActionsComposable.kt:33)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM());
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                i4 = i3;
                transferBannerV2 = state.getTransferBannerV2();
                if (transferBannerV2 == null && (!transferBannerV2.isEmpty())) {
                    composerStartRestartGroup.startReplaceGroup(2074893827);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(-1772220517);
                    i5 = i4;
                    modifier4 = modifier3;
                    i7 = 6;
                    i6 = 1;
                    arrangement2 = arrangement;
                    SduiColumns.SduiColumn(transferBannerV2, com.robinhood.models.serverdriven.experimental.api.GenericAction.class, modifierFillMaxWidth$default2, null, null, HorizontalPadding.Default, arrangement.getTop(), companion.getStart(), false, composerStartRestartGroup, 384, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                } else {
                    arrangement2 = arrangement;
                    i5 = i4;
                    modifier4 = modifier3;
                    i6 = 1;
                    i7 = 6;
                    composerStartRestartGroup.startReplaceGroup(2075074371);
                    transferBanner = state.getTransferBanner();
                    if (transferBanner != null) {
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composerStartRestartGroup, 6, 1);
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        Component.ComponentType componentType = Component.ComponentType.INFO_BANNER;
                        GenericAction action = transferBanner.getAction();
                        GenericAction.DeeplinkAction deeplinkAction = action instanceof GenericAction.DeeplinkAction ? (GenericAction.DeeplinkAction) action : null;
                        String string2 = (deeplinkAction == null || (uri = deeplinkAction.getUri()) == null) ? null : uri.toString();
                        if (string2 == null) {
                            string2 = "";
                        }
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(componentType, string2, null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                        AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo = RichTexts2.m15956toAnnotatedStringiJQMabo(transferBanner.getTitle(), bentoTheme.getColors(composerStartRestartGroup, i9).m21425getFg0d7_KjU(), composerStartRestartGroup, 0, 0);
                        final GenericAction action2 = transferBanner.getAction();
                        composerStartRestartGroup.startReplaceGroup(205516817);
                        if (action2 == null) {
                            function0 = null;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = ((i5 & 112) == 32) | composerStartRestartGroup.changedInstance(action2);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.view.CryptoDetailTransferActionsComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoDetailTransferActionsComposable2.m1924xa9c71aec(onBannerAction, action2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            function0 = (Function0) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ServerToBentoAssetMapper2 icon = transferBanner.getIcon();
                        BentoInfoBanner2.m20654BentoInfoBannernjYn8yo(annotatedStringM15956toAnnotatedStringiJQMabo, null, bentoTheme.getColors(composerStartRestartGroup, i9).m21425getFg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i9).m21372getBg20d7_KjU(), modifierAutoLogEvents$default, icon != null ? new BentoIcon4.Size16(icon) : null, function0, null, composerStartRestartGroup, (BentoIcon4.Size16.$stable << 15) | 48, 128);
                        composerStartRestartGroup = composerStartRestartGroup;
                        Unit unit2 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                transferButtonsV2 = state.getTransferButtonsV2();
                if (transferButtonsV2 == null && ((transferButtonsV2.isEmpty() ? 1 : 0) ^ i6) == i6) {
                    composerStartRestartGroup.startReplaceGroup(2076380308);
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i6, null);
                    ImmutableList<UIComponent<com.robinhood.models.serverdriven.experimental.api.GenericAction>> transferButtonsV22 = state.getTransferButtonsV2();
                    composerStartRestartGroup.startReplaceGroup(-1772220517);
                    SduiColumns.SduiColumn(transferButtonsV22, com.robinhood.models.serverdriven.experimental.api.GenericAction.class, modifierFillMaxWidth$default3, null, null, HorizontalPadding.Default, arrangement2.getTop(), companion.getStart(), false, composerStartRestartGroup, 384, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(2076544484);
                    CryptoDetailTransferButtonRowComposable.CryptoDetailTransferButtonRowComposable(state.getTransferButtons(), onButtonAction, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i6, null), 0.0f, composerStartRestartGroup, i7, i6), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.view.CryptoDetailTransferActionsComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoDetailTransferActionsComposable2.CryptoDetailTransferActionsComposable$lambda$6(state, onBannerAction, onButtonAction, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            arrangement = Arrangement.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i92 = BentoTheme.$stable;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21590getDefaultD9Ej5fM());
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, companion3.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default4);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                i4 = i3;
                transferBannerV2 = state.getTransferBannerV2();
                if (transferBannerV2 == null) {
                    arrangement2 = arrangement;
                    i5 = i4;
                    modifier4 = modifier3;
                    i6 = 1;
                    i7 = 6;
                    composerStartRestartGroup.startReplaceGroup(2075074371);
                    transferBanner = state.getTransferBanner();
                    if (transferBanner != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    transferButtonsV2 = state.getTransferButtonsV2();
                    if (transferButtonsV2 == null) {
                        composerStartRestartGroup.startReplaceGroup(2076544484);
                        CryptoDetailTransferButtonRowComposable.CryptoDetailTransferButtonRowComposable(state.getTransferButtons(), onButtonAction, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i6, null), 0.0f, composerStartRestartGroup, i7, i6), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier5 = modifier4;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoDetailTransferActionsComposable$lambda$5$lambda$4$lambda$2$lambda$1$lambda$0 */
    public static final Unit m1924xa9c71aec(Function1 function1, GenericAction genericAction) {
        function1.invoke(genericAction);
        return Unit.INSTANCE;
    }
}
