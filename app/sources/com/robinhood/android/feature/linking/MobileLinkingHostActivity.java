package com.robinhood.android.feature.linking;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.transition.Transition;
import android.transition.TransitionInflater;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.compose.ComponentActivity6;
import androidx.view.result.ActivityResultCaller;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.blackwidow.contracts.MobileLinkingHostIntentKey;
import com.robinhood.android.blackwidow.contracts.MobileLinkingResultContract;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.equities.contracts.tradeladder.EquityTradeLadderFragmentKey;
import com.robinhood.android.feature.linking.MobileLinkingErrorFragment;
import com.robinhood.android.feature.linking.MobileLinkingHostActivity;
import com.robinhood.android.feature.linking.MobileLinkingHostDuxo8;
import com.robinhood.android.futures.contracts.FuturesLadderFragmentKey;
import com.robinhood.android.futures.contracts.FuturesOrderFormFragmentKey;
import com.robinhood.android.lib.futures.trade.FuturesLadderFragmentCallbacks;
import com.robinhood.android.lib.futures.trade.FuturesOrderFormFragmentCallbacks;
import com.robinhood.android.lib.futures.trade.UiFuturesOrderContext;
import com.robinhood.android.linking.MobileLinkingData2;
import com.robinhood.android.linking.MobileLinkingNotificationHandler;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesOrderTrigger;
import com.robinhood.android.models.futures.api.order.FuturesOrderType;
import com.robinhood.android.models.futures.p189db.FuturesOrderConfiguration;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: MobileLinkingHostActivity.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 Z2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001ZB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0014J\u0006\u0010B\u001a\u00020?J\b\u0010C\u001a\u00020?H\u0014J\b\u0010D\u001a\u00020?H\u0014J\b\u0010E\u001a\u00020?H\u0014J\b\u0010F\u001a\u00020?H\u0014J\b\u0010G\u001a\u00020?H\u0014J\u0010\u0010H\u001a\u00020?2\u0006\u0010I\u001a\u00020JH\u0016J\b\u0010K\u001a\u00020\u001eH\u0016J\u0010\u0010L\u001a\u00020?2\u0006\u0010M\u001a\u00020NH\u0016J\u0010\u0010O\u001a\u00020?2\u0006\u0010P\u001a\u00020\u000eH\u0016J\b\u0010Q\u001a\u00020?H\u0016J\b\u0010R\u001a\u00020?H\u0016J\b\u0010S\u001a\u00020?H\u0002J\b\u0010T\u001a\u00020UH\u0016J\b\u0010V\u001a\u00020?H\u0016J\b\u0010W\u001a\u00020?H\u0016J\u0012\u0010X\u001a\u00020?2\b\b\u0002\u0010Y\u001a\u00020\u000eH\u0002R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R/\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\r\u001a\u0004\u0018\u00010\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R+\u0010#\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u0014\u0010(\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u00104\u001a\u0002058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0011\u0010:\u001a\u00020;¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=¨\u0006[²\u0006\n\u0010\\\u001a\u00020]X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingHostActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/lib/futures/trade/FuturesLadderFragmentCallbacks;", "Lcom/robinhood/android/lib/futures/trade/FuturesOrderFormFragmentCallbacks;", "Lcom/robinhood/android/linking/MobileLinkingCallbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/feature/linking/MobileLinkingHostDuxo;", "getDuxo", "()Lcom/robinhood/android/feature/linking/MobileLinkingHostDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "<set-?>", "", "showSelectGroupSheet", "getShowSelectGroupSheet", "()Z", "setShowSelectGroupSheet", "(Z)V", "showSelectGroupSheet$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/robinhood/android/account/strings/DisplayName;", "accountTypeDialog", "getAccountTypeDialog", "()Lcom/robinhood/android/account/strings/DisplayName;", "setAccountTypeDialog", "(Lcom/robinhood/android/account/strings/DisplayName;)V", "accountTypeDialog$delegate", "futuresOrderConfig", "Lcom/robinhood/android/models/futures/db/FuturesOrderConfiguration;", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "soundPlayed", "getSoundPlayed", "setSoundPlayed", "soundPlayed$delegate", "Lkotlin/properties/ReadWriteProperty;", "vibrator", "Landroid/os/Vibrator;", "getVibrator", "()Landroid/os/Vibrator;", "notificationManager", "Lcom/robinhood/android/common/notification/NotificationManager;", "getNotificationManager", "()Lcom/robinhood/android/common/notification/NotificationManager;", "setNotificationManager", "(Lcom/robinhood/android/common/notification/NotificationManager;)V", "notificationHandler", "Lcom/robinhood/android/linking/MobileLinkingNotificationHandler;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "playSound", "onStart", "onResume", "onPause", "onStop", "onDestroy", "reviewOrder", Card.Icon.ORDER, "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$OrderRequest;", "getOrderConfig", "onOrderTypeClicked", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "exitOrderForm", "shouldFadeOut", "onExitLadder", "onDonePressed", "exitFuturesOrderForm", "getLadderFragmentOrderChecksResolver", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;", "openSelectGroupSheet", "onFinish", "finishWithResult", "showCollapsedView", "Companion", "feature-mobile-linking_externalDebug", "state", "Lcom/robinhood/android/feature/linking/MobileLinkingHostState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MobileLinkingHostActivity extends BaseActivity implements FuturesLadderFragmentCallbacks, FuturesOrderFormFragmentCallbacks, MobileLinkingData2 {
    private static final String TAG_EQUITIES_LADDER_FRAGMENT = "equitiesLadderFragment";
    private static final String TAG_ERROR_FRAGMENT = "errorFragment";
    private static final String TAG_FUTURES_LADDER_FRAGMENT = "futuresLadderFragment";
    private static final String TAG_FUTURES_ORDER_FRAGMENT = "futuresOrderFragment";
    public EventLogger eventLogger;
    public NotificationManager notificationManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(MobileLinkingHostActivity.class, "soundPlayed", "getSoundPlayed()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MobileLinkingHostDuxo.class);

    /* renamed from: showSelectGroupSheet$delegate, reason: from kotlin metadata */
    private final SnapshotState showSelectGroupSheet = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* renamed from: accountTypeDialog$delegate, reason: from kotlin metadata */
    private final SnapshotState accountTypeDialog = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    private FuturesOrderConfiguration futuresOrderConfig = FuturesOrderConfiguration.INSTANCE.invoke(FuturesOrderType.MARKET, FuturesOrderTrigger.IMMEDIATE);

    /* renamed from: soundPlayed$delegate, reason: from kotlin metadata */
    private final Interfaces3 soundPlayed = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[0]);
    private final MobileLinkingNotificationHandler notificationHandler = new MobileLinkingNotificationHandler(new Function2() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(MobileLinkingHostActivity.notificationHandler$lambda$0(this.f$0, (String) obj, (String) obj2));
        }
    });
    private final Screen eventScreen = new Screen(null, null, "LEGEND_LINKED_EXPERIENCE", null, 11, null);

    @Override // com.robinhood.android.lib.futures.trade.FuturesOrderFormFragmentCallbacks
    public void onOrderTypeClicked(FuturesOrderSide side) {
        Intrinsics.checkNotNullParameter(side, "side");
    }

    public final MobileLinkingHostDuxo getDuxo() {
        return (MobileLinkingHostDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectGroupSheet() {
        return ((Boolean) this.showSelectGroupSheet.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShowSelectGroupSheet(boolean z) {
        this.showSelectGroupSheet.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final DisplayName getAccountTypeDialog() {
        return (DisplayName) this.accountTypeDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAccountTypeDialog(DisplayName displayName) {
        this.accountTypeDialog.setValue(displayName);
    }

    private final MediaPlayer getMediaPlayer() {
        MediaPlayer mediaPlayerCreate = MediaPlayer.create(this, C16754R.raw.link);
        Intrinsics.checkNotNullExpressionValue(mediaPlayerCreate, "create(...)");
        return mediaPlayerCreate;
    }

    /* compiled from: MobileLinkingHostActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$1 */
    static final class C167331 implements Function2<Composer, Integer, Unit> {
        C167331() {
        }

        /* compiled from: MobileLinkingHostActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ SnapshotState4<MobileLinkingHostState> $state$delegate;
            final /* synthetic */ MobileLinkingHostActivity this$0;

            AnonymousClass1(MobileLinkingHostActivity mobileLinkingHostActivity, SnapshotState4<MobileLinkingHostState> snapshotState4) {
                this.this$0 = mobileLinkingHostActivity;
                this.$state$delegate = snapshotState4;
            }

            public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                int i2;
                Composer composer2 = composer;
                if ((i & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-928810544, i, -1, "com.robinhood.android.feature.linking.MobileLinkingHostActivity.onCreate.<anonymous>.<anonymous> (MobileLinkingHostActivity.kt:96)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                final MobileLinkingHostActivity mobileLinkingHostActivity = this.this$0;
                SnapshotState4<MobileLinkingHostState> snapshotState4 = this.$state$delegate;
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                List<Color> colors = C167331.invoke$lambda$0(snapshotState4).getColors();
                ImmutableList immutableList = colors != null ? extensions2.toImmutableList(colors) : null;
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance = composer2.changedInstance(mobileLinkingHostActivity);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MobileLinkingHostActivity.C167331.AnonymousClass1.invoke$lambda$12$lambda$1$lambda$0(mobileLinkingHostActivity);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                AuraComposable.AuraComposable(immutableList, ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), composer2, 0, 0);
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composer2, 0);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default2);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21596getXxlargeD9Ej5fM()), composer2, 0);
                Modifier modifierWeight$default = Column5.weight$default(column6, companion, 1.0f, false, 2, null);
                int i3 = C16754R.id.mobile_linking_fragment_container;
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer2.changedInstance(mobileLinkingHostActivity);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MobileLinkingHostActivity.C167331.AnonymousClass1.invoke$lambda$12$lambda$4$lambda$3$lambda$2(mobileLinkingHostActivity);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                MobileLinkingBottomSheetComposable.MobileLinkingBottomSheetComposable(i3, (Function0) objRememberedValue2, modifierWeight$default, composer2, 0, 0);
                composer2.endNode();
                composer2.startReplaceGroup(1969994286);
                if (mobileLinkingHostActivity.getShowSelectGroupSheet()) {
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composer2.changedInstance(mobileLinkingHostActivity);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$1$1$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MobileLinkingHostActivity.C167331.AnonymousClass1.invoke$lambda$12$lambda$6$lambda$5(mobileLinkingHostActivity);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    i2 = 0;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue3, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(235014742, true, new MobileLinkingHostActivity2(snapshotState4, mobileLinkingHostActivity), composer2, 54), composer, 1572864, 62);
                    composer2 = composer;
                } else {
                    i2 = 0;
                }
                composer2.endReplaceGroup();
                DisplayName accountTypeDialog = mobileLinkingHostActivity.getAccountTypeDialog();
                composer2.startReplaceGroup(1970024487);
                if (accountTypeDialog != null) {
                    int i4 = C16754R.string.mobile_linking_account_type_dialog_title;
                    StringResource title = accountTypeDialog.getWithAccount().getTitle();
                    Resources resources = mobileLinkingHostActivity.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    String strStringResource = StringResources_androidKt.stringResource(i4, new Object[]{title.getText(resources)}, composer2, i2);
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C16754R.string.mobile_linking_account_type_dialog_message, composer2, i2));
                    String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_got_it, composer2, i2);
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance4 = composer2.changedInstance(mobileLinkingHostActivity);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$1$1$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MobileLinkingHostActivity.C167331.AnonymousClass1.invoke$lambda$12$lambda$11$lambda$8$lambda$7(mobileLinkingHostActivity);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue4);
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance5 = composer2.changedInstance(mobileLinkingHostActivity);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$1$1$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MobileLinkingHostActivity.C167331.AnonymousClass1.invoke$lambda$12$lambda$11$lambda$10$lambda$9(mobileLinkingHostActivity);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceGroup();
                    BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue5, composer, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    Unit unit = Unit.INSTANCE;
                }
                composer.endReplaceGroup();
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$12$lambda$1$lambda$0(MobileLinkingHostActivity mobileLinkingHostActivity) {
                mobileLinkingHostActivity.finishWithResult(true);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$12$lambda$4$lambda$3$lambda$2(MobileLinkingHostActivity mobileLinkingHostActivity) {
                mobileLinkingHostActivity.finishWithResult(true);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$12$lambda$6$lambda$5(MobileLinkingHostActivity mobileLinkingHostActivity) {
                mobileLinkingHostActivity.setShowSelectGroupSheet(false);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$12$lambda$11$lambda$8$lambda$7(MobileLinkingHostActivity mobileLinkingHostActivity) {
                mobileLinkingHostActivity.setAccountTypeDialog(null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$12$lambda$11$lambda$10$lambda$9(MobileLinkingHostActivity mobileLinkingHostActivity) {
                mobileLinkingHostActivity.setAccountTypeDialog(null);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MobileLinkingHostState invoke$lambda$0(SnapshotState4<MobileLinkingHostState> snapshotState4) {
            return snapshotState4.getValue();
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
                ComposerKt.traceEventStart(1994003592, i, -1, "com.robinhood.android.feature.linking.MobileLinkingHostActivity.onCreate.<anonymous> (MobileLinkingHostActivity.kt:93)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-928810544, true, new AnonymousClass1(MobileLinkingHostActivity.this, FlowExtKt.collectAsStateWithLifecycle(MobileLinkingHostActivity.this.getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7)), composer, 54), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getSoundPlayed() {
        return ((Boolean) this.soundPlayed.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final void setSoundPlayed(boolean z) {
        this.soundPlayed.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    private final Vibrator getVibrator() {
        Object systemService = getSystemService((Class<Object>) Vibrator.class);
        Intrinsics.checkNotNullExpressionValue(systemService, "getSystemService(...)");
        return (Vibrator) systemService;
    }

    public final NotificationManager getNotificationManager() {
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager != null) {
            return notificationManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationManager");
        return null;
    }

    public final void setNotificationManager(NotificationManager notificationManager) {
        Intrinsics.checkNotNullParameter(notificationManager, "<set-?>");
        this.notificationManager = notificationManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean notificationHandler$lambda$0(MobileLinkingHostActivity mobileLinkingHostActivity, String str, String groupId) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        mobileLinkingHostActivity.getDuxo().setSelectedGroupId(groupId);
        mobileLinkingHostActivity.playSound();
        return true;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentActivity6.setContent$default(this, null, ComposableLambda3.composableLambdaInstance(1994003592, true, new C167331()), 1, null);
        BaseActivity.collectDuxoState$default(this, null, new C167342(null), 1, null);
    }

    /* compiled from: MobileLinkingHostActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$2", m3645f = "MobileLinkingHostActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$2 */
    static final class C167342 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C167342(Continuation<? super C167342> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MobileLinkingHostActivity.this.new C167342(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C167342) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<MobileLinkingHostDuxo8>> eventFlow = MobileLinkingHostActivity.this.getDuxo().getEventFlow();
                final MobileLinkingHostActivity mobileLinkingHostActivity = MobileLinkingHostActivity.this;
                FlowCollector<? super Event<MobileLinkingHostDuxo8>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostActivity.onCreate.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<MobileLinkingHostDuxo8>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<MobileLinkingHostDuxo8> event, Continuation<? super Unit> continuation) {
                        EventConsumer<MobileLinkingHostDuxo8> eventConsumerInvoke;
                        EventConsumer<MobileLinkingHostDuxo8> eventConsumerInvoke2;
                        EventConsumer<MobileLinkingHostDuxo8> eventConsumerInvoke3;
                        EventConsumer<MobileLinkingHostDuxo8> eventConsumerInvoke4;
                        EventConsumer<MobileLinkingHostDuxo8> eventConsumerInvoke5;
                        EventConsumer<MobileLinkingHostDuxo8> eventConsumerInvoke6;
                        EventConsumer<MobileLinkingHostDuxo8> eventConsumerInvoke7;
                        EventConsumer<MobileLinkingHostDuxo8> eventConsumerInvoke8;
                        if (event != null) {
                            final MobileLinkingHostActivity mobileLinkingHostActivity2 = mobileLinkingHostActivity;
                            if ((event.getData() instanceof MobileLinkingHostDuxo8.ShowAccountTypeDialog) && (eventConsumerInvoke8 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke8.consume(event, new Function1() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m14460invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m14460invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mobileLinkingHostActivity2.setAccountTypeDialog(((MobileLinkingHostDuxo8.ShowAccountTypeDialog) event.getData()).getDisplayName());
                                    }
                                });
                            }
                        }
                        if (event != null) {
                            final MobileLinkingHostActivity mobileLinkingHostActivity3 = mobileLinkingHostActivity;
                            if ((event.getData() instanceof MobileLinkingHostDuxo8.TryPlaySound) && (eventConsumerInvoke7 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke7.consume(event, new Function1() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$2$1$emit$$inlined$consumeIfType$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws IllegalStateException {
                                        m14461invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m14461invoke(Object it) throws IllegalStateException {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        if (!((MobileLinkingHostIntentKey) MobileLinkingHostActivity.INSTANCE.getExtras((Activity) mobileLinkingHostActivity3)).getPlaySound() || mobileLinkingHostActivity3.getSoundPlayed()) {
                                            return;
                                        }
                                        mobileLinkingHostActivity3.playSound();
                                    }
                                });
                            }
                        }
                        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        if (event != null) {
                            final MobileLinkingHostActivity mobileLinkingHostActivity4 = mobileLinkingHostActivity;
                            if ((event.getData() instanceof MobileLinkingHostDuxo8.ShowFuturesLadder) && (eventConsumerInvoke6 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke6.consume(event, new Function1() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$2$1$emit$$inlined$consumeIfType$3
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m14462invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Type inference failed for: r11v7, types: [T, kotlin.Pair] */
                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m14462invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        MobileLinkingHostDuxo8.ShowFuturesLadder showFuturesLadder = (MobileLinkingHostDuxo8.ShowFuturesLadder) event.getData();
                                        Fragment fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(mobileLinkingHostActivity4.getNavigator(), new FuturesLadderFragmentKey(showFuturesLadder.getContractId(), new Screen(null, null, null, null, 15, null), showFuturesLadder.getGroup()), null, 2, null);
                                        objectRef.element = Tuples4.m3642to(fragmentCreateFragment$default, "futuresLadderFragment");
                                    }
                                });
                            }
                        }
                        if (event != null) {
                            final MobileLinkingHostActivity mobileLinkingHostActivity5 = mobileLinkingHostActivity;
                            if ((event.getData() instanceof MobileLinkingHostDuxo8.ShowEquitiesLadder) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$2$1$emit$$inlined$consumeIfType$4
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m14463invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Type inference failed for: r6v7, types: [T, kotlin.Pair] */
                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m14463invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        MobileLinkingHostDuxo8.ShowEquitiesLadder showEquitiesLadder = (MobileLinkingHostDuxo8.ShowEquitiesLadder) event.getData();
                                        Navigator navigator = mobileLinkingHostActivity5.getNavigator();
                                        String string2 = showEquitiesLadder.getInstrument().getId().toString();
                                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                        Fragment fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(navigator, new EquityTradeLadderFragmentKey(string2, "legend", showEquitiesLadder.getGroup(), true), null, 2, null);
                                        objectRef.element = Tuples4.m3642to(fragmentCreateFragment$default, "equitiesLadderFragment");
                                    }
                                });
                            }
                        }
                        if (event != null && (event.getData() instanceof MobileLinkingHostDuxo8.ShowUnsupportedError) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$2$1$emit$$inlined$consumeIfType$5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m14464invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Type inference failed for: r3v7, types: [T, kotlin.Pair] */
                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m14464invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    MobileLinkingErrorFragment mobileLinkingErrorFragment = (MobileLinkingErrorFragment) MobileLinkingErrorFragment.INSTANCE.newInstance((Parcelable) new MobileLinkingErrorFragment.Args.UnsupportedError(((MobileLinkingHostDuxo8.ShowUnsupportedError) event.getData()).getGroup()));
                                    objectRef.element = Tuples4.m3642to(mobileLinkingErrorFragment, "errorFragment");
                                }
                            });
                        }
                        if (event != null && (event.getData() instanceof MobileLinkingHostDuxo8.ShowNetworkError) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$2$1$emit$$inlined$consumeIfType$6
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m14465invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Type inference failed for: r3v7, types: [T, kotlin.Pair] */
                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m14465invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    MobileLinkingErrorFragment mobileLinkingErrorFragment = (MobileLinkingErrorFragment) MobileLinkingErrorFragment.INSTANCE.newInstance((Parcelable) new MobileLinkingErrorFragment.Args.NetworkError(((MobileLinkingHostDuxo8.ShowNetworkError) event.getData()).getException()));
                                    objectRef.element = Tuples4.m3642to(mobileLinkingErrorFragment, "errorFragment");
                                }
                            });
                        }
                        if (event != null && (event.getData() instanceof MobileLinkingHostDuxo8.ShowNoWidgetsError) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$2$1$emit$$inlined$consumeIfType$7
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m14466invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Type inference failed for: r3v7, types: [T, kotlin.Pair] */
                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m14466invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    MobileLinkingErrorFragment mobileLinkingErrorFragment = (MobileLinkingErrorFragment) MobileLinkingErrorFragment.INSTANCE.newInstance((Parcelable) new MobileLinkingErrorFragment.Args.NoWidgetsError(((MobileLinkingHostDuxo8.ShowNoWidgetsError) event.getData()).getGroup()));
                                    objectRef.element = Tuples4.m3642to(mobileLinkingErrorFragment, "errorFragment");
                                }
                            });
                        }
                        if (event != null && (event.getData() instanceof MobileLinkingHostDuxo8.ShowNoLinkedGroupError) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$2$1$emit$$inlined$consumeIfType$8
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m14467invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Type inference failed for: r3v7, types: [T, kotlin.Pair] */
                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m14467invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    MobileLinkingErrorFragment mobileLinkingErrorFragment = (MobileLinkingErrorFragment) MobileLinkingErrorFragment.INSTANCE.newInstance((Parcelable) MobileLinkingErrorFragment.Args.NoLinkedGroupError.INSTANCE);
                                    objectRef.element = Tuples4.m3642to(mobileLinkingErrorFragment, "errorFragment");
                                }
                            });
                        }
                        Tuples2 tuples2 = (Tuples2) objectRef.element;
                        if (tuples2 != null) {
                            mobileLinkingHostActivity.getSupportFragmentManager().beginTransaction().replace(C16754R.id.mobile_linking_fragment_container, (Fragment) tuples2.component1(), (String) tuples2.component2()).commit();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    public final void playSound() throws IllegalStateException {
        setSoundPlayed(true);
        getMediaPlayer().start();
        if (Build.VERSION.SDK_INT >= 29) {
            getVibrator().vibrate(VibrationEffect.createWaveform(new long[]{0, 40, 86, 115, 176, 177, 372}, new int[]{1, EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, 5, EnumC7081g.f2778x3356acf6, 6, 255, 0}, -1));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, this.eventScreen, null, null, null, 29, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.notificationManager != null) {
            getNotificationManager().addInterceptor(this.notificationHandler);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.notificationManager != null) {
            getNotificationManager().removeInterceptor(this.notificationHandler);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() throws IllegalStateException {
        getMediaPlayer().stop();
        getVibrator().cancel();
        EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, this.eventScreen, null, null, null, 29, null);
        super.onStop();
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        getMediaPlayer().release();
        super.onDestroy();
    }

    @Override // com.robinhood.android.lib.futures.trade.FuturesLadderFragmentCallbacks
    public void reviewOrder(UiFuturesOrderContext.OrderRequest order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.futuresOrderConfig = FuturesOrderConfiguration.INSTANCE.invoke(order.getOrderType(), order.getOrderTrigger());
        getSupportFragmentManager().beginTransaction().add(C16754R.id.mobile_linking_fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), new FuturesOrderFormFragmentKey.WithOrderToReview(order, new Screen(Screen.Name.FUTURES_LADDER_SCREEN, null, "LINKED_EXPERIENCE", null, 10, null)), null, 2, null), TAG_FUTURES_ORDER_FRAGMENT).addToBackStack(null).commit();
    }

    @Override // com.robinhood.android.lib.futures.trade.FuturesOrderFormFragmentCallbacks
    /* renamed from: getOrderConfig, reason: from getter */
    public FuturesOrderConfiguration getFuturesOrderConfig() {
        return this.futuresOrderConfig;
    }

    @Override // com.robinhood.android.lib.futures.trade.FuturesOrderFormFragmentCallbacks
    public void exitOrderForm(boolean shouldFadeOut) {
        exitFuturesOrderForm();
    }

    @Override // com.robinhood.android.lib.futures.trade.FuturesLadderFragmentCallbacks
    public void onExitLadder() {
        finishWithResult(false);
    }

    @Override // com.robinhood.android.lib.futures.trade.FuturesOrderFormFragmentCallbacks
    public void onDonePressed() {
        exitFuturesOrderForm();
    }

    private final void exitFuturesOrderForm() {
        Transition transitionInflateTransition = TransitionInflater.from(this).inflateTransition(C16754R.transition.fade);
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag(TAG_FUTURES_ORDER_FRAGMENT);
        if (fragmentFindFragmentByTag != null) {
            fragmentFindFragmentByTag.setReturnTransition(transitionInflateTransition);
        }
        getSupportFragmentManager().popBackStack();
    }

    @Override // com.robinhood.android.lib.futures.trade.FuturesOrderFormFragmentCallbacks
    public FuturesOrderCheckResolver getLadderFragmentOrderChecksResolver() {
        ActivityResultCaller activityResultCallerFindFragmentByTag = getSupportFragmentManager().findFragmentByTag(TAG_FUTURES_LADDER_FRAGMENT);
        FuturesOrderCheckResolver futuresOrderCheckResolver = activityResultCallerFindFragmentByTag instanceof FuturesOrderCheckResolver ? (FuturesOrderCheckResolver) activityResultCallerFindFragmentByTag : null;
        if (futuresOrderCheckResolver != null) {
            return futuresOrderCheckResolver;
        }
        throw new IllegalStateException("Called getLadderFragmentOrderChecksResolver, but LadderFragment wasn't the root!");
    }

    @Override // com.robinhood.android.linking.MobileLinkingData2
    public void openSelectGroupSheet() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, this.eventScreen, new Component(null, "LEGEND_LINKED_EXPERIENCE_SWITCH_GROUP", null, 5, null), null, null, false, 57, null);
        setShowSelectGroupSheet(true);
    }

    @Override // com.robinhood.android.linking.MobileLinkingData2
    public void onFinish() {
        finishWithResult(false);
    }

    static /* synthetic */ void finishWithResult$default(MobileLinkingHostActivity mobileLinkingHostActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        mobileLinkingHostActivity.finishWithResult(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(boolean showCollapsedView) {
        NavigationActivityResultContract3.setResult(this, new MobileLinkingResultContract.Result(((MobileLinkingHostIntentKey) INSTANCE.getExtras((Activity) this)).getAccountNumber(), showCollapsedView));
        finish();
    }

    /* compiled from: MobileLinkingHostActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingHostActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostActivity;", "Lcom/robinhood/android/blackwidow/contracts/MobileLinkingHostIntentKey;", "<init>", "()V", "TAG_EQUITIES_LADDER_FRAGMENT", "", "TAG_FUTURES_LADDER_FRAGMENT", "TAG_FUTURES_ORDER_FRAGMENT", "TAG_ERROR_FRAGMENT", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<MobileLinkingHostActivity, MobileLinkingHostIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public MobileLinkingHostIntentKey getExtras(MobileLinkingHostActivity mobileLinkingHostActivity) {
            return (MobileLinkingHostIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, mobileLinkingHostActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, MobileLinkingHostIntentKey mobileLinkingHostIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, mobileLinkingHostIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, MobileLinkingHostIntentKey mobileLinkingHostIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, mobileLinkingHostIntentKey);
        }
    }
}
