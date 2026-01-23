package com.robinhood.android.internalassettransfers.history;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory5;
import com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryViewState;
import com.robinhood.android.internalassettransfers.history.models.UiAssetTransferDetailsStatus;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.component.rows.BentoTimelineRowKt;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: InternalAssetTransferHistory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0003¢\u0006\u0002\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u0018\u001a\u001d\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"VIEW_ASSET_LIST_IDENTIFIER", "", "CANCEL_IDENTIFIER", "CONTACT_SUPPORT_IDENTIFIER", "InternalAssetTransferHistory", "", "viewState", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState;", "callbacks", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState;Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewInternalAssetTransferHistory", "(Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState;Landroidx/compose/runtime/Composer;I)V", "InternalAssetTransferHistoryToolbar", "onNavigationBackClick", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "InternalAssetTransferHistoryContent", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState$Loaded;", "(Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState$Loaded;Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryCallbacks;Landroidx/compose/runtime/Composer;I)V", "InternalAssetTransferHistoryContentLayoutMainContent", "state", "(Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState$Loaded;Landroidx/compose/runtime/Composer;I)V", "InternalAssetTransferHistoryContentLayoutBottomBar", "feature-internal-asset-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferHistory5 {
    private static final String CANCEL_IDENTIFIER = "cancel";
    private static final String CONTACT_SUPPORT_IDENTIFIER = "contact_support";
    private static final String VIEW_ASSET_LIST_IDENTIFIER = "view_asset_list";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferHistory$lambda$0(InternalAssetTransferHistoryViewState internalAssetTransferHistoryViewState, InternalAssetTransferHistory4 internalAssetTransferHistory4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InternalAssetTransferHistory(internalAssetTransferHistoryViewState, internalAssetTransferHistory4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferHistoryContent$lambda$10(InternalAssetTransferHistoryViewState.Loaded loaded, InternalAssetTransferHistory4 internalAssetTransferHistory4, int i, Composer composer, int i2) {
        InternalAssetTransferHistoryContent(loaded, internalAssetTransferHistory4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferHistoryContentLayoutBottomBar$lambda$23(InternalAssetTransferHistoryViewState.Loaded loaded, InternalAssetTransferHistory4 internalAssetTransferHistory4, int i, Composer composer, int i2) {
        InternalAssetTransferHistoryContentLayoutBottomBar(loaded, internalAssetTransferHistory4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferHistoryContentLayoutMainContent$lambda$15(InternalAssetTransferHistoryViewState.Loaded loaded, int i, Composer composer, int i2) {
        InternalAssetTransferHistoryContentLayoutMainContent(loaded, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferHistoryToolbar$lambda$3(Function0 function0, int i, Composer composer, int i2) {
        InternalAssetTransferHistoryToolbar(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewInternalAssetTransferHistory$lambda$1(InternalAssetTransferHistoryViewState internalAssetTransferHistoryViewState, int i, Composer composer, int i2) {
        PreviewInternalAssetTransferHistory(internalAssetTransferHistoryViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: InternalAssetTransferHistory.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$InternalAssetTransferHistory$2 */
    static final class C192112 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ InternalAssetTransferHistory4 $callbacks;
        final /* synthetic */ InternalAssetTransferHistoryViewState $viewState;

        C192112(InternalAssetTransferHistoryViewState internalAssetTransferHistoryViewState, InternalAssetTransferHistory4 internalAssetTransferHistory4) {
            this.$viewState = internalAssetTransferHistoryViewState;
            this.$callbacks = internalAssetTransferHistory4;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = (composer.changed(paddingValues) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-296096327, i2, -1, "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory.<anonymous> (InternalAssetTransferHistory.kt:87)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
            InternalAssetTransferHistoryViewState internalAssetTransferHistoryViewState = this.$viewState;
            final InternalAssetTransferHistory4 internalAssetTransferHistory4 = this.$callbacks;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (internalAssetTransferHistoryViewState instanceof InternalAssetTransferHistoryViewState.Error) {
                composer.startReplaceGroup(289254468);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(internalAssetTransferHistory4);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$InternalAssetTransferHistory$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InternalAssetTransferHistory5.C192112.invoke$lambda$2$lambda$1$lambda$0(internalAssetTransferHistory4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                ErrorScreenComposable.ErrorScreenComposable(null, (Function0) objRememberedValue, 0, null, null, null, null, false, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                composer.endReplaceGroup();
            } else if (internalAssetTransferHistoryViewState instanceof InternalAssetTransferHistoryViewState.Loaded) {
                composer.startReplaceGroup(289481667);
                InternalAssetTransferHistory5.InternalAssetTransferHistoryContent((InternalAssetTransferHistoryViewState.Loaded) internalAssetTransferHistoryViewState, internalAssetTransferHistory4, composer, 0);
                composer.endReplaceGroup();
            } else {
                if (!(internalAssetTransferHistoryViewState instanceof InternalAssetTransferHistoryViewState.Loading)) {
                    composer.startReplaceGroup(840613464);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(840631275);
                LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(635251087, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$InternalAssetTransferHistory$2$1$2
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
                            ComposerKt.traceEventStart(635251087, i3, -1, "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferHistory.kt:107)");
                        }
                        UiAssetTransferDetailsStatus.Pending pending = UiAssetTransferDetailsStatus.Pending.INSTANCE;
                        BrokerageAccountType brokerageAccountType = BrokerageAccountType.INDIVIDUAL;
                        BrokerageAccountType brokerageAccountType2 = BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
                        StringResource.Companion companion2 = StringResource.INSTANCE;
                        InternalAssetTransferHistory5.InternalAssetTransferHistoryContent(new InternalAssetTransferHistoryViewState.Loaded(pending, brokerageAccountType, brokerageAccountType2, "0000-00-00", null, false, false, companion2.invoke("--- --------"), companion2.invoke("--- --------"), null), internalAssetTransferHistory4, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 3078, 6);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(InternalAssetTransferHistory4 internalAssetTransferHistory4) {
            internalAssetTransferHistory4.onTryAgainClick();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InternalAssetTransferHistory(final InternalAssetTransferHistoryViewState viewState, final InternalAssetTransferHistory4 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(255769128);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(255769128, i3, -1, "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory (InternalAssetTransferHistory.kt:78)");
                }
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(571697380, true, new C192101(callbacks), composerStartRestartGroup, 54), null, null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(-296096327, true, new C192112(viewState, callbacks), composerStartRestartGroup, 54), composer2, 805306416, 444);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InternalAssetTransferHistory5.InternalAssetTransferHistory$lambda$0(viewState, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(571697380, true, new C192101(callbacks), composerStartRestartGroup, 54), null, null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(-296096327, true, new C192112(viewState, callbacks), composerStartRestartGroup, 54), composer2, 805306416, 444);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: InternalAssetTransferHistory.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$InternalAssetTransferHistory$1 */
    static final class C192101 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ InternalAssetTransferHistory4 $callbacks;

        C192101(InternalAssetTransferHistory4 internalAssetTransferHistory4) {
            this.$callbacks = internalAssetTransferHistory4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(571697380, i, -1, "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory.<anonymous> (InternalAssetTransferHistory.kt:81)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$callbacks);
            final InternalAssetTransferHistory4 internalAssetTransferHistory4 = this.$callbacks;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$InternalAssetTransferHistory$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InternalAssetTransferHistory5.C192101.invoke$lambda$1$lambda$0(internalAssetTransferHistory4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            InternalAssetTransferHistory5.InternalAssetTransferHistoryToolbar((Function0) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(InternalAssetTransferHistory4 internalAssetTransferHistory4) {
            internalAssetTransferHistory4.onNavigationBackClick();
            return Unit.INSTANCE;
        }
    }

    private static final void PreviewInternalAssetTransferHistory(final InternalAssetTransferHistoryViewState internalAssetTransferHistoryViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1299633935);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(internalAssetTransferHistoryViewState) : composerStartRestartGroup.changedInstance(internalAssetTransferHistoryViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1299633935, i2, -1, "com.robinhood.android.internalassettransfers.history.PreviewInternalAssetTransferHistory (InternalAssetTransferHistory.kt:132)");
            }
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE), LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE)}, ComposableLambda3.rememberComposableLambda(-905868721, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt.PreviewInternalAssetTransferHistory.1
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
                        ComposerKt.traceEventStart(-905868721, i3, -1, "com.robinhood.android.internalassettransfers.history.PreviewInternalAssetTransferHistory.<anonymous> (InternalAssetTransferHistory.kt:137)");
                    }
                    final InternalAssetTransferHistoryViewState internalAssetTransferHistoryViewState2 = internalAssetTransferHistoryViewState;
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(192169367, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt.PreviewInternalAssetTransferHistory.1.1
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
                                ComposerKt.traceEventStart(192169367, i4, -1, "com.robinhood.android.internalassettransfers.history.PreviewInternalAssetTransferHistory.<anonymous>.<anonymous> (InternalAssetTransferHistory.kt:138)");
                            }
                            InternalAssetTransferHistory5.InternalAssetTransferHistory(internalAssetTransferHistoryViewState2, new InternalAssetTransferHistory4() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt.PreviewInternalAssetTransferHistory.1.1.1
                                @Override // com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory4
                                public void onCancelRequestButtonClick() {
                                }

                                @Override // com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory4
                                public void onContactSupportButtonClick() {
                                }

                                @Override // com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory4
                                public void onDialogDismiss() {
                                }

                                @Override // com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory4
                                public void onDialogPositiveClick() {
                                }

                                @Override // com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory4
                                public void onNavigationBackClick() {
                                }

                                @Override // com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory4
                                public void onTryAgainClick() {
                                }

                                @Override // com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory4
                                public void onViewAssetListButtonClick() {
                                }
                            }, null, composer3, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferHistory5.PreviewInternalAssetTransferHistory$lambda$1(internalAssetTransferHistoryViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InternalAssetTransferHistoryToolbar(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-208473562);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-208473562, i2, -1, "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryToolbar (InternalAssetTransferHistory.kt:190)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(InternalAssetTransferHistory2.INSTANCE.m2090xe3e51cdf(), null, ComposableLambda3.rememberComposableLambda(2019257295, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$InternalAssetTransferHistoryToolbar$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                    invoke(bentoAppBarScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i3 & 6) == 0) {
                        i3 |= (i3 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2019257295, i3, -1, "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryToolbar.<anonymous>.<anonymous> (InternalAssetTransferHistory.kt:195)");
                    }
                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU()), function0, composer2, (BentoAppBarScope.$stable << 12) | ((i3 << 12) & 57344), 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, false, false, null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU()), 0L, null, composerStartRestartGroup, 390, 0, 1786);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferHistory5.InternalAssetTransferHistoryToolbar$lambda$3(function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InternalAssetTransferHistoryContent(final InternalAssetTransferHistoryViewState.Loaded loaded, final InternalAssetTransferHistory4 internalAssetTransferHistory4, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-661261079);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(loaded) : composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(internalAssetTransferHistory4) : composerStartRestartGroup.changedInstance(internalAssetTransferHistory4) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-661261079, i3, -1, "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryContent (InternalAssetTransferHistory.kt:207)");
            }
            boolean z = true;
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-1546693164, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt.InternalAssetTransferHistoryContent.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i4 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1546693164, i4, -1, "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryContent.<anonymous> (InternalAssetTransferHistory.kt:214)");
                    }
                    InternalAssetTransferHistory5.InternalAssetTransferHistoryContentLayoutBottomBar(loaded, internalAssetTransferHistory4, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(2094323457, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt.InternalAssetTransferHistoryContent.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i4 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2094323457, i4, -1, "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryContent.<anonymous> (InternalAssetTransferHistory.kt:211)");
                    }
                    InternalAssetTransferHistory5.InternalAssetTransferHistoryContentLayoutMainContent(loaded, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3504, 1);
            if (loaded.getShowDialog()) {
                String strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_history_dialog_title_text, composerStartRestartGroup, 0);
                int i4 = i3 & 14;
                BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(loaded.getDialogTitleText(composerStartRestartGroup, i4));
                String dialogPositiveButtonText = loaded.getDialogPositiveButtonText(composerStartRestartGroup, i4);
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i5 = i3 & 112;
                boolean z2 = i5 == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(internalAssetTransferHistory4));
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InternalAssetTransferHistory5.InternalAssetTransferHistoryContent$lambda$5$lambda$4(internalAssetTransferHistory4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertButton bentoAlertButton = new BentoAlertButton(dialogPositiveButtonText, (Function0) objRememberedValue);
                String dialogNegativeButtonText = loaded.getDialogNegativeButtonText(composerStartRestartGroup, i4);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z3 = i5 == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(internalAssetTransferHistory4));
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InternalAssetTransferHistory5.InternalAssetTransferHistoryContent$lambda$7$lambda$6(internalAssetTransferHistory4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertButton bentoAlertButton2 = new BentoAlertButton(dialogNegativeButtonText, (Function0) objRememberedValue2);
                composerStartRestartGroup.startReplaceGroup(5004770);
                if (i5 != 32 && ((i3 & 64) == 0 || !composerStartRestartGroup.changedInstance(internalAssetTransferHistory4))) {
                    z = false;
                }
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InternalAssetTransferHistory5.InternalAssetTransferHistoryContent$lambda$9$lambda$8(internalAssetTransferHistory4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function0 function0 = (Function0) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                int i6 = BentoAlertDialog2.Body.Text.$stable << 3;
                int i7 = BentoAlertButton.$stable;
                BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, function0, composerStartRestartGroup, i6 | (i7 << 6) | (i7 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferHistory5.InternalAssetTransferHistoryContent$lambda$10(loaded, internalAssetTransferHistory4, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferHistoryContent$lambda$5$lambda$4(InternalAssetTransferHistory4 internalAssetTransferHistory4) {
        internalAssetTransferHistory4.onDialogPositiveClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferHistoryContent$lambda$7$lambda$6(InternalAssetTransferHistory4 internalAssetTransferHistory4) {
        internalAssetTransferHistory4.onDialogDismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferHistoryContent$lambda$9$lambda$8(InternalAssetTransferHistory4 internalAssetTransferHistory4) {
        internalAssetTransferHistory4.onDialogDismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static final void InternalAssetTransferHistoryContentLayoutMainContent(final InternalAssetTransferHistoryViewState.Loaded loaded, Composer composer, final int i) {
        int i2;
        BentoTheme bentoTheme;
        int i3;
        int i4;
        ?? r1;
        SpanStyle spanStyle;
        Composer composerStartRestartGroup = composer.startRestartGroup(688331425);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(loaded) : composerStartRestartGroup.changedInstance(loaded) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(688331425, i2, -1, "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryContentLayoutMainContent (InternalAssetTransferHistory.kt:241)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_history_title_text, composerStartRestartGroup, 0), PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8124);
            composerStartRestartGroup = composerStartRestartGroup;
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-594220082);
            if (Intrinsics.areEqual(loaded.getStatus(), UiAssetTransferDetailsStatus.Pending.INSTANCE)) {
                BentoTimelineRowKt.m20996BentoTimelineRowcZKY2IM(Timeline.Status.COMPLETE, Timeline.Position.TOP, StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_history_pending_transfer_request_text, composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_history_pending_submitted_text, composerStartRestartGroup, 0), null, null, null, null, false, null, null, false, false, 0, false, 0, false, false, false, composerStartRestartGroup, 3126, 0, 0, 2097104);
                r1 = 0;
                i4 = 0;
                BentoTimelineRowKt.m20996BentoTimelineRowcZKY2IM(Timeline.Status.INCOMPLETE, Timeline.Position.BOTTOM, StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_history_pending_transfer_complete_text, composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_history_pending_pending_text, composerStartRestartGroup, 0), null, null, null, null, false, null, null, false, false, 0, false, 0, false, false, false, composerStartRestartGroup, 3126, 0, 0, 2097104);
                bentoTheme = bentoTheme2;
                composerStartRestartGroup = composerStartRestartGroup;
                i3 = i5;
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            } else {
                bentoTheme = bentoTheme2;
                i3 = i5;
                i4 = 0;
                r1 = 0;
            }
            composerStartRestartGroup.endReplaceGroup();
            AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_history_status_title_text, composerStartRestartGroup, i4), r1, 2, r1);
            composerStartRestartGroup.startReplaceGroup(-594184809);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(i4, 1, r1);
            composerStartRestartGroup.startReplaceGroup(-594183347);
            if (loaded.getStatus() instanceof UiAssetTransferDetailsStatus.Failed) {
                spanStyle = new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i3).getJoule(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null);
            } else {
                spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, (DefaultConstructorMarker) null);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-594175709);
            int iPushStyle = builder.pushStyle(spanStyle);
            try {
                builder.append(loaded.getStatus().asString(composerStartRestartGroup, i4));
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                composerStartRestartGroup.endReplaceGroup();
                AnnotatedString annotatedString2 = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                BentoDataRowState bentoDataRowState = new BentoDataRowState(null, annotatedString, null, null, null, annotatedString2, null, null, null, null, false, false, 4061, null);
                int i6 = BentoDataRowState.$stable;
                BentoDataRowKt.BentoDataRow(bentoDataRowState, null, null, composerStartRestartGroup, i6, 6);
                AnnotatedString annotatedString3 = new AnnotatedString(StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_history_source_account_title_text, composerStartRestartGroup, i4), r1, 2, r1);
                StringResource sourceAccountName = loaded.getSourceAccountName();
                int i7 = StringResource.$stable;
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString3, null, null, null, new AnnotatedString(StringResources6.getText(sourceAccountName, composerStartRestartGroup, i7).toString(), r1, 2, r1), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i6, 6);
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_history_sink_account_title_text, composerStartRestartGroup, i4), r1, 2, r1), null, null, null, new AnnotatedString(StringResources6.getText(loaded.getSinkAccountName(), composerStartRestartGroup, i7).toString(), r1, 2, r1), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i6, 6);
                String completed = loaded.getCompleted();
                composerStartRestartGroup.startReplaceGroup(-594153583);
                if (completed != null) {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_history_completed_title_text, composerStartRestartGroup, i4), r1, 2, r1), null, null, null, new AnnotatedString(completed, r1, 2, r1), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i6, 6);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_history_submitted_title_text, composerStartRestartGroup, i4), r1, 2, r1), null, null, null, new AnnotatedString(loaded.getSubmissionDate(), r1, 2, r1), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i6, 6);
                composerStartRestartGroup.startReplaceGroup(-594137028);
                if (loaded.getAcatsMatchMovementAmount() != null) {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_history_acats_bonus_title_text, composerStartRestartGroup, i4), r1, 2, r1), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).getBloom()), null, null, new AnnotatedString(loaded.getAcatsMatchMovementAmount(), r1, 2, r1), null, null, null, null, false, false, 4057, null), null, null, composerStartRestartGroup, i6, 6);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferHistory5.InternalAssetTransferHistoryContentLayoutMainContent$lambda$15(loaded, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0364  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InternalAssetTransferHistoryContentLayoutBottomBar(final InternalAssetTransferHistoryViewState.Loaded loaded, final InternalAssetTransferHistory4 internalAssetTransferHistory4, Composer composer, final int i) {
        int i2;
        BentoTheme bentoTheme;
        int i3;
        int i4;
        int i5;
        final InternalAssetTransferHistory4 internalAssetTransferHistory42;
        Composer composer2;
        boolean z;
        Object objRememberedValue;
        final InternalAssetTransferHistory4 internalAssetTransferHistory43;
        boolean z2;
        Object objRememberedValue2;
        Composer composerStartRestartGroup = composer.startRestartGroup(925638813);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(loaded) : composerStartRestartGroup.changedInstance(loaded) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(internalAssetTransferHistory4) : composerStartRestartGroup.changedInstance(internalAssetTransferHistory4) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            internalAssetTransferHistory42 = internalAssetTransferHistory4;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(925638813, i2, -1, "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryContentLayoutBottomBar (InternalAssetTransferHistory.kt:333)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i6 = BentoTheme.$stable;
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component.ComponentType componentType = Component.ComponentType.BUTTON;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierFillMaxWidth$default, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, VIEW_ASSET_LIST_IDENTIFIER, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
            String strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_history_view_assets_button, composerStartRestartGroup, 0);
            boolean assetListLoading = loaded.getAssetListLoading();
            long jM21425getFg0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU();
            long jM21371getBg0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU();
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i7 = i2 & 112;
            boolean z3 = i7 == 32 || ((i2 & 64) != 0 && composerStartRestartGroup.changedInstance(internalAssetTransferHistory4));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InternalAssetTransferHistory5.m2091x3e8d5671(internalAssetTransferHistory4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i8 = i2;
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, strStringResource, modifierAutoLogEvents$default, null, null, false, assetListLoading, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM21371getBg0d7_KjU), null, null, false, null, composerStartRestartGroup, 0, 0, 7736);
            Composer composer3 = composerStartRestartGroup;
            composer3.startReplaceGroup(-702707671);
            if (Intrinsics.areEqual(loaded.getStatus(), UiAssetTransferDetailsStatus.Pending.INSTANCE)) {
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CANCEL, null, new Component(componentType, "cancel", null, 4, null), null, 43, null)), true, false, false, true, false, null, 108, null);
                String strStringResource2 = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_history_cancel_request_button, composer3, 0);
                long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composer3, i6).m21371getBg0d7_KjU();
                long joule = bentoTheme2.getColors(composer3, i6).getJoule();
                long joule2 = bentoTheme2.getColors(composer3, i6).getJoule();
                composer3.startReplaceGroup(5004770);
                if (i7 != 32) {
                    internalAssetTransferHistory43 = internalAssetTransferHistory4;
                    z2 = (i8 & 64) != 0 && composer3.changedInstance(internalAssetTransferHistory43);
                    objRememberedValue2 = composer3.rememberedValue();
                    if (!z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InternalAssetTransferHistory5.m2092x6856bbf5(internalAssetTransferHistory43);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    composer3.endReplaceGroup();
                    i4 = i7;
                    bentoTheme = bentoTheme2;
                    i3 = i6;
                    i5 = 5004770;
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource2, modifierAutoLogEvents$default2, null, null, false, false, Color.m6701boximpl(jM21371getBg0d7_KjU2), Color.m6701boximpl(joule), Color.m6701boximpl(joule2), null, false, null, composer3, 1572864, 0, 7224);
                    composer3 = composer3;
                } else {
                    internalAssetTransferHistory43 = internalAssetTransferHistory4;
                }
                objRememberedValue2 = composer3.rememberedValue();
                if (!z2) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InternalAssetTransferHistory5.m2092x6856bbf5(internalAssetTransferHistory43);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue2);
                    composer3.endReplaceGroup();
                    i4 = i7;
                    bentoTheme = bentoTheme2;
                    i3 = i6;
                    i5 = 5004770;
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource2, modifierAutoLogEvents$default2, null, null, false, false, Color.m6701boximpl(jM21371getBg0d7_KjU2), Color.m6701boximpl(joule), Color.m6701boximpl(joule2), null, false, null, composer3, 1572864, 0, 7224);
                    composer3 = composer3;
                }
            } else {
                bentoTheme = bentoTheme2;
                i3 = i6;
                i4 = i7;
                i5 = 5004770;
            }
            composer3.endReplaceGroup();
            composer3.startReplaceGroup(-702670604);
            if (Intrinsics.areEqual(loaded.getStatus(), UiAssetTransferDetailsStatus.Failed.INSTANCE)) {
                Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, "contact_support", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                String strStringResource3 = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_history_contact_support_button, composer3, 0);
                long jM21371getBg0d7_KjU3 = bentoTheme.getColors(composer3, i3).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer3, i3).m21425getFg0d7_KjU();
                long jM21425getFg0d7_KjU3 = bentoTheme.getColors(composer3, i3).m21425getFg0d7_KjU();
                composer3.startReplaceGroup(i5);
                if (i4 != 32) {
                    if ((i8 & 64) != 0) {
                        internalAssetTransferHistory42 = internalAssetTransferHistory4;
                        if (composer3.changedInstance(internalAssetTransferHistory42)) {
                        }
                        objRememberedValue = composer3.rememberedValue();
                        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InternalAssetTransferHistory5.m2093xc8e2cb63(internalAssetTransferHistory42);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer3.endReplaceGroup();
                        composer2 = composer3;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource3, modifierAutoLogEvents$default3, null, null, false, false, Color.m6701boximpl(jM21371getBg0d7_KjU3), Color.m6701boximpl(jM21425getFg0d7_KjU2), Color.m6701boximpl(jM21425getFg0d7_KjU3), null, false, null, composer2, 1572864, 0, 7224);
                    } else {
                        internalAssetTransferHistory42 = internalAssetTransferHistory4;
                    }
                    z = false;
                    objRememberedValue = composer3.rememberedValue();
                    if (z) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InternalAssetTransferHistory5.m2093xc8e2cb63(internalAssetTransferHistory42);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                        composer3.endReplaceGroup();
                        composer2 = composer3;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource3, modifierAutoLogEvents$default3, null, null, false, false, Color.m6701boximpl(jM21371getBg0d7_KjU3), Color.m6701boximpl(jM21425getFg0d7_KjU2), Color.m6701boximpl(jM21425getFg0d7_KjU3), null, false, null, composer2, 1572864, 0, 7224);
                    }
                } else {
                    internalAssetTransferHistory42 = internalAssetTransferHistory4;
                }
                z = true;
                objRememberedValue = composer3.rememberedValue();
                if (z) {
                }
            } else {
                internalAssetTransferHistory42 = internalAssetTransferHistory4;
                composer2 = composer3;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferHistory5.InternalAssetTransferHistoryContentLayoutBottomBar$lambda$23(loaded, internalAssetTransferHistory42, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InternalAssetTransferHistoryContentLayoutBottomBar$lambda$22$lambda$17$lambda$16 */
    public static final Unit m2091x3e8d5671(InternalAssetTransferHistory4 internalAssetTransferHistory4) {
        internalAssetTransferHistory4.onViewAssetListButtonClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InternalAssetTransferHistoryContentLayoutBottomBar$lambda$22$lambda$19$lambda$18 */
    public static final Unit m2092x6856bbf5(InternalAssetTransferHistory4 internalAssetTransferHistory4) {
        internalAssetTransferHistory4.onCancelRequestButtonClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InternalAssetTransferHistoryContentLayoutBottomBar$lambda$22$lambda$21$lambda$20 */
    public static final Unit m2093xc8e2cb63(InternalAssetTransferHistory4 internalAssetTransferHistory4) {
        internalAssetTransferHistory4.onContactSupportButtonClick();
        return Unit.INSTANCE;
    }
}
