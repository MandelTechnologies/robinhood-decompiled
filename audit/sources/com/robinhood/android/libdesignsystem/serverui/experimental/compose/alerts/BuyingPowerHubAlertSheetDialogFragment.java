package com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts;

import android.content.Context;
import android.net.Uri;
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
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.BuyingPowerHubAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
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

/* compiled from: BuyingPowerHubAlertSheetDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\f\rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0017¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/alerts/BuyingPowerHubAlertSheetDialogFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/BuyingPowerHubAction;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "handle", "", "action", "Args", "Companion", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class BuyingPowerHubAlertSheetDialogFragment extends GenericComposeBottomSheetDialogFragment implements SduiActionHandler<BuyingPowerHubAction> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeBottomSheetDialogFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(BuyingPowerHubAlertSheetDialogFragment buyingPowerHubAlertSheetDialogFragment, int i, Composer composer, int i2) {
        buyingPowerHubAlertSheetDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-239007843);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-239007843, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BuyingPowerHubAlertSheetDialogFragment.ComposeContent (BuyingPowerHubAlertSheetDialogFragment.kt:20)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1035556776, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BuyingPowerHubAlertSheetDialogFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(1035556776, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BuyingPowerHubAlertSheetDialogFragment.ComposeContent.<anonymous> (BuyingPowerHubAlertSheetDialogFragment.kt:22)");
                    }
                    SduiAlert sduiAlert = SduiAlert.INSTANCE;
                    final GenericAlertContent<BuyingPowerHubAction> alert = ((Args) BuyingPowerHubAlertSheetDialogFragment.INSTANCE.getArgs((Fragment) BuyingPowerHubAlertSheetDialogFragment.this)).getAlert();
                    BuyingPowerHubAlertSheetDialogFragment buyingPowerHubAlertSheetDialogFragment = BuyingPowerHubAlertSheetDialogFragment.this;
                    int i4 = GenericComposeBottomSheetDialogFragment.$stable << 3;
                    composer2.startReplaceGroup(1847729312);
                    final Button button = (Button) alert.getAction_buttons().get(0);
                    final Button button2 = (Button) CollectionsKt.getOrNull(alert.getAction_buttons(), 1);
                    SduiActionHandler3.ProvideActionHandler(buyingPowerHubAlertSheetDialogFragment, ComposableLambda3.rememberComposableLambda(925557249, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BuyingPowerHubAlertSheetDialogFragment$ComposeContent$1$invoke$$inlined$AlertSheet$1
                        public final void invoke(Composer composer3, int i5) {
                            long jM21372getBg20d7_KjU;
                            String serverValue;
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
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
                            BentoAlertButton alertButton = sduiAlert2.toAlertButton(button, null, composer3, 0, 1);
                            Button button3 = button2;
                            composer3.startReplaceGroup(402298512);
                            BentoAlertButton alertButton2 = button3 == null ? null : sduiAlert2.toAlertButton(button3, null, composer3, 0, 1);
                            composer3.endReplaceGroup();
                            int i6 = BentoAlertButton.$stable;
                            int i7 = (i6 << 9) | (i6 << 12);
                            composer3.startReplaceGroup(221388998);
                            final int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1694075195, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BuyingPowerHubAlertSheetDialogFragment$ComposeContent$1$invoke$$inlined$AlertSheet$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i8) {
                                    if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
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
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer4, 48);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion2);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    composer4.startReplaceGroup(1390346787);
                                    if (str.length() > 0) {
                                        BentoAlerts2.m20854AlertBodyText5stqomU(str, i9, composer4, 0, 0);
                                    }
                                    composer4.endReplaceGroup();
                                    composer4.startReplaceGroup(1390351170);
                                    if (list != null) {
                                        ImmutableList3 persistentList = extensions2.toPersistentList(list);
                                        HorizontalPadding horizontalPadding = HorizontalPadding.None;
                                        composer4.startReplaceGroup(-1772220517);
                                        SduiColumns.SduiColumn(persistentList, BuyingPowerHubAction.class, companion2, null, null, horizontalPadding, arrangement.getTop(), companion.getStart(), true, composer4, 100859904, 0);
                                        composer4.endReplaceGroup();
                                    }
                                    composer4.endReplaceGroup();
                                    composer4.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer3, i8).m21371getBg0d7_KjU(), null, 2, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM4872backgroundbw27NRU$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
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
                            if (bentoTheme.getColors(composer3, i8).getIsDay()) {
                                composer3.startReplaceGroup(-2071673393);
                                jM21372getBg20d7_KjU = bentoTheme.getColors(composer3, i8).getJet();
                            } else {
                                composer3.startReplaceGroup(-2071672529);
                                jM21372getBg20d7_KjU = bentoTheme.getColors(composer3, i8).m21372getBg20d7_KjU();
                            }
                            composer3.endReplaceGroup();
                            BoxKt.Box(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, jM21372getBg20d7_KjU, null, 2, null), composer3, 0);
                            BentoAlerts2.AlertContent(null, serverToBentoAssetMapper3FromServerValue, title, null, CollectionsKt.listOfNotNull((Object[]) new BentoAlertButton[]{alertButton, alertButton2}), false, composableLambdaRememberComposableLambda, composer3, ((i7 >> 12) & 112) | 1572864 | ((i7 << 6) & 896) | (i6 << 12), 41);
                            composer3.endNode();
                            composer3.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, ((i4 >> 3) & 14) | 48);
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BuyingPowerHubAlertSheetDialogFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BuyingPowerHubAlertSheetDialogFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: BuyingPowerHubAlertSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/alerts/BuyingPowerHubAlertSheetDialogFragment$Args;", "Landroid/os/Parcelable;", "alert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/BuyingPowerHubAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "getAlert", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final GenericAlertContent<BuyingPowerHubAction> alert;

        /* compiled from: BuyingPowerHubAlertSheetDialogFragment.kt */
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

        public final GenericAlertContent<BuyingPowerHubAction> component1() {
            return this.alert;
        }

        public final Args copy(GenericAlertContent<? extends BuyingPowerHubAction> alert) {
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
        public Args(GenericAlertContent<? extends BuyingPowerHubAction> alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.alert = alert;
        }

        public final GenericAlertContent<BuyingPowerHubAction> getAlert() {
            return this.alert;
        }
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo15941handle(BuyingPowerHubAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof BuyingPowerHubAction.Deeplink) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((BuyingPowerHubAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
            return true;
        }
        if (!(action instanceof BuyingPowerHubAction.Dismiss)) {
            return false;
        }
        dismiss();
        return true;
    }

    /* compiled from: BuyingPowerHubAlertSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/alerts/BuyingPowerHubAlertSheetDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/alerts/BuyingPowerHubAlertSheetDialogFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/alerts/BuyingPowerHubAlertSheetDialogFragment$Args;", "<init>", "()V", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<BuyingPowerHubAlertSheetDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(BuyingPowerHubAlertSheetDialogFragment buyingPowerHubAlertSheetDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, buyingPowerHubAlertSheetDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BuyingPowerHubAlertSheetDialogFragment newInstance(Args args) {
            return (BuyingPowerHubAlertSheetDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BuyingPowerHubAlertSheetDialogFragment buyingPowerHubAlertSheetDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, buyingPowerHubAlertSheetDialogFragment, args);
        }
    }
}
