package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.logging.RhyEventLoggingUtils;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.RhyOverviewNuxViewState;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.rhy.contracts.RhyRefereeLandingKey;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RhyOverviewNuxComposable.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a5\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a]\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0007¢\u0006\u0002\u0010\u001f\u001aP\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0002\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u00018\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005¨\u0006&"}, m3636d2 = {"RhyOverviewNuxImage", "", "getRhyOverviewNuxImage$annotations", "()V", "getRhyOverviewNuxImage", "()Ljava/lang/String;", "RhyOverviewNuxRow", "getRhyOverviewNuxRow$annotations", "getRhyOverviewNuxRow", "RhyOverviewNux", "", "modifier", "Landroidx/compose/ui/Modifier;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "launchGoogleWallet", "Lkotlin/Function0;", "viewState", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxViewState;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/navigation/Navigator;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxViewState;Landroidx/compose/runtime/Composer;II)V", "RhyOverviewNuxComposable", "nuxItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem;", "cardId", "Ljava/util/UUID;", "nuxTitle", "hasDdRelationship", "", "hasClickedDdPref", "Lcom/robinhood/prefs/BooleanPreference;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/navigation/Navigator;Lkotlinx/collections/immutable/ImmutableList;Ljava/util/UUID;Ljava/lang/String;ZLcom/robinhood/prefs/BooleanPreference;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "nuxClickAction", "nuxItem", "context", "Landroid/content/Context;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RhyOverviewNuxComposable {
    private static final String RhyOverviewNuxImage = "rhyOverviewNuxImage";
    private static final String RhyOverviewNuxRow = "rhyOverviewNuxRow";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyOverviewNux$lambda$0(Modifier modifier, Navigator navigator, Function0 function0, RhyOverviewNuxViewState rhyOverviewNuxViewState, int i, int i2, Composer composer, int i3) {
        RhyOverviewNux(modifier, navigator, function0, rhyOverviewNuxViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyOverviewNuxComposable$lambda$5(Modifier modifier, Navigator navigator, ImmutableList immutableList, UUID uuid, String str, boolean z, BooleanPreference booleanPreference, Function0 function0, int i, int i2, Composer composer, int i3) {
        RhyOverviewNuxComposable(modifier, navigator, immutableList, uuid, str, z, booleanPreference, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getRhyOverviewNuxImage$annotations() {
    }

    public static /* synthetic */ void getRhyOverviewNuxRow$annotations() {
    }

    public static final String getRhyOverviewNuxImage() {
        return RhyOverviewNuxImage;
    }

    public static final String getRhyOverviewNuxRow() {
        return RhyOverviewNuxRow;
    }

    public static final void RhyOverviewNux(Modifier modifier, final Navigator navigator, final Function0<Unit> launchGoogleWallet, final RhyOverviewNuxViewState viewState, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(launchGoogleWallet, "launchGoogleWallet");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1835810612);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(launchGoogleWallet) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1835810612, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNux (RhyOverviewNuxComposable.kt:45)");
            }
            if (Intrinsics.areEqual(viewState, RhyOverviewNuxViewState.Loading.INSTANCE) || Intrinsics.areEqual(viewState, RhyOverviewNuxViewState.Hidden.INSTANCE)) {
                modifier2 = modifier4;
            } else {
                if (!(viewState instanceof RhyOverviewNuxViewState.Loaded)) {
                    throw new NoWhenBranchMatchedException();
                }
                RhyOverviewNuxViewState.Loaded loaded = (RhyOverviewNuxViewState.Loaded) viewState;
                int i5 = i3;
                modifier2 = modifier4;
                RhyOverviewNuxComposable(modifier2, navigator, loaded.getNuxItems(), loaded.getCardId(), loaded.getTitle(composerStartRestartGroup, 0), loaded.getHasDdRelationship(), loaded.getHasClickedDirectDepositNuxPref(), launchGoogleWallet, composerStartRestartGroup, (i5 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i5 << 15) & 29360128), 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOverviewNuxComposable.RhyOverviewNux$lambda$0(modifier3, navigator, launchGoogleWallet, viewState, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhyOverviewNuxComposable(Modifier modifier, final Navigator navigator, final ImmutableList<? extends NuxItem> nuxItems, final UUID uuid, final String nuxTitle, final boolean z, final BooleanPreference booleanPreference, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        final Context context;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Navigator navigator2 = navigator;
        final UUID uuid2 = uuid;
        final BooleanPreference hasClickedDdPref = booleanPreference;
        final Function0<Unit> launchGoogleWallet = function0;
        Intrinsics.checkNotNullParameter(navigator2, "navigator");
        Intrinsics.checkNotNullParameter(nuxItems, "nuxItems");
        Intrinsics.checkNotNullParameter(nuxTitle, "nuxTitle");
        Intrinsics.checkNotNullParameter(hasClickedDdPref, "hasClickedDdPref");
        Intrinsics.checkNotNullParameter(launchGoogleWallet, "launchGoogleWallet");
        Composer composerStartRestartGroup = composer.startRestartGroup(86582063);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(nuxItems) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(uuid2) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(nuxTitle) ? 16384 : 8192;
        }
        if ((i2 & 32) == 0) {
            if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(hasClickedDdPref) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(launchGoogleWallet) ? 8388608 : 4194304;
            }
            i4 = i3;
            if ((4793491 & i4) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(86582063, i4, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxComposable (RhyOverviewNuxComposable.kt:75)");
                }
                Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 5, null);
                Modifier modifier5 = modifier4;
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(C10285R.drawable.svg_onboarding_checklist, composerStartRestartGroup, 0), "Onboarding Checklist", column6.align(PaddingKt.m5143paddingVpY3zN4(TestTag3.testTag(companion3, RhyOverviewNuxImage), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()), companion.getCenterHorizontally()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
                BentoText2.m20747BentoText38GnDrw(nuxTitle, PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium(), composerStartRestartGroup, (i4 >> 12) & 14, 0, 8188);
                Composer composer3 = composerStartRestartGroup;
                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer3, AutoLoggingCompositionLocals4.$stable);
                composer3.startReplaceGroup(1961790077);
                Composer composer4 = composer3;
                for (final NuxItem nuxItem : nuxItems) {
                    Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, RhyOverviewNuxRow);
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Component component = ((UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getComponent();
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierTestTag, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, component != null ? Component.copy$default(component, null, nuxItem.getLoggingIdentifier(), null, 5, null) : null, null, 47, null), true, false, false, true, false, null, 108, null);
                    BentoBaseRowState.Start.Icon icon = nuxItem.getIcon(composer4, 0);
                    String title = nuxItem.getTitle(composer4, 0);
                    composer4.startReplaceGroup(-1224400529);
                    boolean zChanged = composer4.changed(nuxItem) | composer4.changedInstance(context2) | composer4.changedInstance(navigator2) | composer4.changedInstance(current) | composer4.changedInstance(uuid2) | ((458752 & i4) == 131072) | composer4.changedInstance(hasClickedDdPref) | ((29360128 & i4) == 8388608);
                    Object objRememberedValue = composer4.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Context context3 = context2;
                        final Navigator navigator3 = navigator2;
                        context = context3;
                        Object obj = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RhyOverviewNuxComposable.RhyOverviewNuxComposable$lambda$4$lambda$3$lambda$2$lambda$1(nuxItem, context, navigator3, current, uuid2, z, hasClickedDdPref, launchGoogleWallet);
                            }
                        };
                        composer4.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    } else {
                        context = context2;
                    }
                    composer4.endReplaceGroup();
                    Composer composer5 = composer4;
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default, icon, title, null, null, null, null, false, false, false, 0L, (Function0) objRememberedValue, composer5, BentoBaseRowState.Start.Icon.$stable << 3, 0, 2040);
                    uuid2 = uuid;
                    hasClickedDdPref = booleanPreference;
                    launchGoogleWallet = function0;
                    context2 = context;
                    composer4 = composer5;
                    navigator2 = navigator;
                }
                composer2 = composer4;
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return RhyOverviewNuxComposable.RhyOverviewNuxComposable$lambda$5(modifier3, navigator, nuxItems, uuid, nuxTitle, z, booleanPreference, function0, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i4 = i3;
        if ((4793491 & i4) == 4793490) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Context context22 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 5, null);
            Modifier modifier52 = modifier4;
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
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
                Modifier.Companion companion32 = Modifier.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(C10285R.drawable.svg_onboarding_checklist, composerStartRestartGroup, 0), "Onboarding Checklist", column62.align(PaddingKt.m5143paddingVpY3zN4(TestTag3.testTag(companion32, RhyOverviewNuxImage), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM()), companion4.getCenterHorizontally()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
                BentoText2.m20747BentoText38GnDrw(nuxTitle, PaddingKt.m5144paddingVpY3zN4$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleMedium(), composerStartRestartGroup, (i4 >> 12) & 14, 0, 8188);
                Composer composer32 = composerStartRestartGroup;
                final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer32, AutoLoggingCompositionLocals4.$stable);
                composer32.startReplaceGroup(1961790077);
                Composer composer42 = composer32;
                while (r27.hasNext()) {
                }
                composer2 = composer42;
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyOverviewNuxComposable$lambda$4$lambda$3$lambda$2$lambda$1(NuxItem nuxItem, Context context, Navigator navigator, EventLogger eventLogger, UUID uuid, boolean z, BooleanPreference booleanPreference, Function0 function0) {
        nuxClickAction(nuxItem, context, navigator, eventLogger, uuid, z, booleanPreference, function0);
        return Unit.INSTANCE;
    }

    private static final void nuxClickAction(NuxItem nuxItem, Context context, Navigator navigator, EventLogger eventLogger, UUID uuid, boolean z, BooleanPreference booleanPreference, Function0<Unit> function0) {
        if (nuxItem instanceof NuxItem.SpendWithCard) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.RhyCardSettings(null), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return;
        }
        if (nuxItem instanceof NuxItem.ActivateCard) {
            if (((NuxItem.ActivateCard) nuxItem).getIsComplete()) {
                return;
            }
            Navigator.DefaultImpls.startActivity$default(navigator, context, new LegacyIntentKey.ActivateCard(uuid), null, false, null, null, 60, null);
            return;
        }
        if (nuxItem instanceof NuxItem.ReviewAccount) {
            booleanPreference.set(true);
            Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.RhyDirectDepositInfo(z, false), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return;
        }
        if (nuxItem instanceof NuxItem.AddToWallet) {
            if (((NuxItem.AddToWallet) nuxItem).getIsComplete()) {
                return;
            }
            function0.invoke();
        } else if (nuxItem instanceof NuxItem.FundAccount) {
            if (((NuxItem.FundAccount) nuxItem).getIsComplete()) {
                return;
            }
            Navigator.DefaultImpls.startActivity$default(navigator, context, new Transfer(new TransferConfiguration.Standard(null, null, false, new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.RHY, 3, null), null, null, null, false, false, null, null, false, 8167, null)), null, false, null, null, 60, null);
        } else {
            if (!(nuxItem instanceof NuxItem.ViewReferralOffer)) {
                throw new NoWhenBranchMatchedException();
            }
            UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_REFERRAL_OFFER;
            RhyEventLoggingUtils rhyEventLoggingUtils = RhyEventLoggingUtils.INSTANCE;
            Screen rhyTabScreen = rhyEventLoggingUtils.getRhyTabScreen();
            com.robinhood.rosetta.eventlogging.Context rhyTabContext = rhyEventLoggingUtils.getRhyTabContext();
            RHYContext rhy_context = rhyEventLoggingUtils.getRhyTabContext().getRhy_context();
            EventLogger.DefaultImpls.logTap$default(eventLogger, action, rhyTabScreen, null, null, com.robinhood.rosetta.eventlogging.Context.copy$default(rhyTabContext, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, rhy_context != null ? RHYContext.copy$default(rhy_context, RHYContext.ProductArea.REFERRALS, "rhy_home", "cash_tab", null, null, null, 56, null) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -2049, -1, -1, -1, 16383, null), false, 44, null);
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, RhyRefereeLandingKey.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
        }
    }
}
