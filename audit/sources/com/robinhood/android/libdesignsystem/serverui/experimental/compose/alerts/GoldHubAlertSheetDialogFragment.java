package com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GoldHubAction;
import com.robinhood.models.serverdriven.experimental.api.Pictogram;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GoldHubAlertSheetDialogFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0019\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0012\u001a\u00020\rH\u0017¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0014R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/alerts/GoldHubAlertSheetDialogFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GoldHubAction;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "actionHandler", "getActionHandler", "()Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "setActionHandler", "(Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;)V", "onDismiss", "Lkotlin/Function0;", "", "getOnDismiss", "()Lkotlin/jvm/functions/Function0;", "setOnDismiss", "(Lkotlin/jvm/functions/Function0;)V", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "handle", "", "action", "activity", "Landroid/app/Activity;", "Args", "Companion", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class GoldHubAlertSheetDialogFragment extends GenericComposeBottomSheetDialogFragment implements SduiActionHandler<GoldHubAction> {
    private SduiActionHandler<? super GoldHubAction> actionHandler;
    private Function0<Unit> onDismiss;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(GoldHubAlertSheetDialogFragment goldHubAlertSheetDialogFragment, int i, Composer composer, int i2) {
        goldHubAlertSheetDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final SduiActionHandler<GoldHubAction> getActionHandler() {
        return this.actionHandler;
    }

    public final void setActionHandler(SduiActionHandler<? super GoldHubAction> sduiActionHandler) {
        this.actionHandler = sduiActionHandler;
    }

    public final Function0<Unit> getOnDismiss() {
        return this.onDismiss;
    }

    public final void setOnDismiss(Function0<Unit> function0) {
        this.onDismiss = function0;
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(468851109);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(468851109, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.GoldHubAlertSheetDialogFragment.ComposeContent (GoldHubAlertSheetDialogFragment.kt:23)");
            }
            SduiActionHandler3.ProvideActionHandler(this.actionHandler, ComposableLambda3.rememberComposableLambda(917778502, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.GoldHubAlertSheetDialogFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(917778502, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.GoldHubAlertSheetDialogFragment.ComposeContent.<anonymous> (GoldHubAlertSheetDialogFragment.kt:25)");
                    }
                    final GoldHubAlertSheetDialogFragment goldHubAlertSheetDialogFragment = GoldHubAlertSheetDialogFragment.this;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1123965265, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.GoldHubAlertSheetDialogFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1123965265, i4, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.GoldHubAlertSheetDialogFragment.ComposeContent.<anonymous>.<anonymous> (GoldHubAlertSheetDialogFragment.kt:26)");
                            }
                            SduiAlert sduiAlert = SduiAlert.INSTANCE;
                            final GenericAlertContent<GoldHubAction> alert = ((Args) GoldHubAlertSheetDialogFragment.INSTANCE.getArgs((Fragment) goldHubAlertSheetDialogFragment)).getAlert();
                            GoldHubAlertSheetDialogFragment goldHubAlertSheetDialogFragment2 = goldHubAlertSheetDialogFragment;
                            composer3.startReplaceGroup(1847729312);
                            final Button button = (Button) alert.getAction_buttons().get(0);
                            final Button button2 = (Button) CollectionsKt.getOrNull(alert.getAction_buttons(), 1);
                            SduiActionHandler3.ProvideActionHandler(goldHubAlertSheetDialogFragment2, ComposableLambda3.rememberComposableLambda(925557249, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.GoldHubAlertSheetDialogFragment$ComposeContent$1$1$invoke$$inlined$AlertSheet$1
                                public final void invoke(Composer composer4, int i5) {
                                    long jM21372getBg20d7_KjU;
                                    String serverValue;
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(925557249, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.AlertSheet.<anonymous> (SduiAlert.kt:186)");
                                    }
                                    Pictogram pog = alert.getPog();
                                    ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = (pog == null || (serverValue = pog.getServerValue()) == null) ? null : ServerToBentoAssetMapper3.INSTANCE.fromServerValue(serverValue);
                                    String title = alert.getTitle();
                                    final String body_markdown = alert.getBody_markdown();
                                    final List body_components = alert.getBody_components();
                                    SduiAlert sduiAlert2 = SduiAlert.INSTANCE;
                                    BentoAlertButton alertButton = sduiAlert2.toAlertButton(button, null, composer4, 0, 1);
                                    Button button3 = button2;
                                    composer4.startReplaceGroup(402298512);
                                    BentoAlertButton alertButton2 = button3 == null ? null : sduiAlert2.toAlertButton(button3, null, composer4, 0, 1);
                                    composer4.endReplaceGroup();
                                    int i6 = BentoAlertButton.$stable;
                                    int i7 = (i6 << 9) | (i6 << 12);
                                    composer4.startReplaceGroup(221388998);
                                    final int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1694075195, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.GoldHubAlertSheetDialogFragment$ComposeContent$1$1$invoke$$inlined$AlertSheet$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i8) {
                                            if ((i8 & 3) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1694075195, i8, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertSheet.<anonymous> (BentoSduiAlertSheet.kt:38)");
                                            }
                                            Alignment.Companion companion = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                                            String str = body_markdown;
                                            int i9 = iM7919getCentere0LSkKk;
                                            List list = body_components;
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer5, 48);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, companion2);
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                            if (composer5.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                            Column6 column6 = Column6.INSTANCE;
                                            composer5.startReplaceGroup(1390346787);
                                            if (str.length() > 0) {
                                                BentoAlerts2.m20854AlertBodyText5stqomU(str, i9, composer5, 0, 0);
                                            }
                                            composer5.endReplaceGroup();
                                            composer5.startReplaceGroup(1390351170);
                                            if (list != null) {
                                                ImmutableList3 persistentList = extensions2.toPersistentList(list);
                                                HorizontalPadding horizontalPadding = HorizontalPadding.None;
                                                composer5.startReplaceGroup(-1772220517);
                                                SduiColumns.SduiColumn(persistentList, GoldHubAction.class, companion2, null, null, horizontalPadding, arrangement.getTop(), companion.getStart(), true, composer5, 100859904, 0);
                                                composer5.endReplaceGroup();
                                            }
                                            composer5.endReplaceGroup();
                                            composer5.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i8 = BentoTheme.$stable;
                                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer4, i8).m21371getBg0d7_KjU(), null, 2, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM4872backgroundbw27NRU$default);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
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
                                    if (bentoTheme.getColors(composer4, i8).getIsDay()) {
                                        composer4.startReplaceGroup(-2071673393);
                                        jM21372getBg20d7_KjU = bentoTheme.getColors(composer4, i8).getJet();
                                    } else {
                                        composer4.startReplaceGroup(-2071672529);
                                        jM21372getBg20d7_KjU = bentoTheme.getColors(composer4, i8).m21372getBg20d7_KjU();
                                    }
                                    composer4.endReplaceGroup();
                                    BoxKt.Box(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, jM21372getBg20d7_KjU, null, 2, null), composer4, 0);
                                    BentoAlerts2.AlertContent(null, serverToBentoAssetMapper3FromServerValue, title, null, CollectionsKt.listOfNotNull((Object[]) new BentoAlertButton[]{alertButton, alertButton2}), false, composableLambdaRememberComposableLambda, composer4, ((i7 >> 12) & 112) | 1572864 | ((i7 << 6) & 896) | (i6 << 12), 41);
                                    composer4.endNode();
                                    composer4.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), composer3, 48);
                            composer3.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.GoldHubAlertSheetDialogFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldHubAlertSheetDialogFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GoldHubAlertSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/alerts/GoldHubAlertSheetDialogFragment$Args;", "Landroid/os/Parcelable;", "alert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GoldHubAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "getAlert", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final GenericAlertContent<GoldHubAction> alert;

        /* compiled from: GoldHubAlertSheetDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((GenericAlertContent) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, GenericAlertContent genericAlertContent, int i, Object obj) {
            if ((i & 1) != 0) {
                genericAlertContent = args.alert;
            }
            return args.copy(genericAlertContent);
        }

        public final GenericAlertContent<GoldHubAction> component1() {
            return this.alert;
        }

        public final Args copy(GenericAlertContent<? extends GoldHubAction> alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            return new Args(alert);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.alert, ((Args) other).alert);
        }

        public int hashCode() {
            return this.alert.hashCode();
        }

        public String toString() {
            return "Args(alert=" + this.alert + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.alert, flags);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(GenericAlertContent<? extends GoldHubAction> alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.alert = alert;
        }

        public final GenericAlertContent<GoldHubAction> getAlert() {
            return this.alert;
        }
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo15941handle(GoldHubAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GoldHubAction.Dismiss) {
            dismiss();
        }
        SduiActionHandler<? super GoldHubAction> sduiActionHandler = this.actionHandler;
        if (sduiActionHandler != null) {
            return sduiActionHandler.mo15941handle(action);
        }
        return false;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment
    protected void onDismiss(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onDismiss(activity);
        Function0<Unit> function0 = this.onDismiss;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* compiled from: GoldHubAlertSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/alerts/GoldHubAlertSheetDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/alerts/GoldHubAlertSheetDialogFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/alerts/GoldHubAlertSheetDialogFragment$Args;", "<init>", "()V", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<GoldHubAlertSheetDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(GoldHubAlertSheetDialogFragment goldHubAlertSheetDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, goldHubAlertSheetDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GoldHubAlertSheetDialogFragment newInstance(Args args) {
            return (GoldHubAlertSheetDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GoldHubAlertSheetDialogFragment goldHubAlertSheetDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, goldHubAlertSheetDialogFragment, args);
        }
    }
}
