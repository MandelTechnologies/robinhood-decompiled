package com.robinhood.android.advanced.alert.alerthub;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo;
import com.robinhood.android.education.contracts.AlertHubCreateIndicatorAlert;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert2;
import com.robinhood.models.advanced.alert.api.ApiAlertHubSettingItem;
import com.robinhood.models.advanced.alert.api.ApiCreateIndicatorAlertItemRequest;
import com.robinhood.models.advanced.alert.api.ApiDeleteAdvancedAlertSettingItemRequest;
import com.robinhood.models.advanced.alert.api.ApiDeleteAdvancedAlertSettingRequest;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingItem;
import com.robinhood.models.advanced.alert.p302db.AlertHubUiResources;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.udf.UiEvent;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertHubCreateIndicatorAlertDuxo.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002-.B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"J\u000e\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u001fJ(\u0010&\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u001fJ\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthub/AlertHubCreateIndicatorAlertDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/advanced/alert/alerthub/AlertHubCreateIndicatorAlertViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "alertStore", "Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "instrumentId", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "technicalIndicator", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "getTechnicalIndicator", "()Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "onResume", "", "updateIndicatorMovingType", "movingType", "Lcom/robinhood/android/advanced/alert/alerthub/IndicatorMovingType;", "updateIntervalLength", "intervalLength", "Lcom/robinhood/models/advanced/alert/api/ApiAlertHubSettingItem$Interval;", "fetchUiResource", "updateBottomTextPlaceholder", "text", "", "createIndicatorAlert", "alertItem", "Lcom/robinhood/models/advanced/alert/api/ApiCreateIndicatorAlertItemRequest;", "updateIndicatorAlert", "deleteSetting", "settingId", "constructIndicatorAlertItemRequest", "alertId", "value", "getInitialStateFromAlert", "Lcom/robinhood/android/advanced/alert/alerthub/AlertHubCreateIndicatorAlertDuxo$InitialStateFromAlert;", "alert", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "InitialStateFromAlert", "Companion", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AlertHubCreateIndicatorAlertDuxo extends OldBaseDuxo<AlertHubCreateIndicatorAlertViewState> implements HasSavedState {
    private final AdvancedAlertStore alertStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AlertHubCreateIndicatorAlertDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlertHubCreateIndicatorAlertViewState2.values().length];
            try {
                iArr[AlertHubCreateIndicatorAlertViewState2.CROSSES_ABOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlertHubCreateIndicatorAlertViewState2.CROSSES_BELOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlertHubCreateIndicatorAlertViewState2.MOVE_ABOVE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AlertHubCreateIndicatorAlertViewState2.MOVE_BELOW_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AlertHubCreateIndicatorAlertDuxo(SavedStateHandle savedStateHandle, AdvancedAlertStore alertStore) {
        super(new AlertHubCreateIndicatorAlertViewState(null, null, null, false, null, null, null, null, 255, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(alertStore, "alertStore");
        this.savedStateHandle = savedStateHandle;
        this.alertStore = alertStore;
    }

    private final UUID getInstrumentId() {
        return ((AlertHubCreateIndicatorAlert) INSTANCE.getArgs((HasSavedState) this)).getInstrumentId();
    }

    private final ApiTechnicalIndicator getTechnicalIndicator() {
        return ((AlertHubCreateIndicatorAlert) INSTANCE.getArgs((HasSavedState) this)).getTechnicalIndicator();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        fetchUiResource();
    }

    public final void updateIndicatorMovingType(final AlertHubCreateIndicatorAlertViewState2 movingType) {
        Intrinsics.checkNotNullParameter(movingType, "movingType");
        applyMutation(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertDuxo.updateIndicatorMovingType$lambda$0(movingType, (AlertHubCreateIndicatorAlertViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertHubCreateIndicatorAlertViewState updateIndicatorMovingType$lambda$0(AlertHubCreateIndicatorAlertViewState2 alertHubCreateIndicatorAlertViewState2, AlertHubCreateIndicatorAlertViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AlertHubCreateIndicatorAlertViewState.copy$default(applyMutation, null, null, null, false, alertHubCreateIndicatorAlertViewState2, null, null, null, 239, null);
    }

    public final void updateIntervalLength(final ApiAlertHubSettingItem.Interval intervalLength) {
        Intrinsics.checkNotNullParameter(intervalLength, "intervalLength");
        applyMutation(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertDuxo.updateIntervalLength$lambda$1(intervalLength, (AlertHubCreateIndicatorAlertViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertHubCreateIndicatorAlertViewState updateIntervalLength$lambda$1(ApiAlertHubSettingItem.Interval interval, AlertHubCreateIndicatorAlertViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AlertHubCreateIndicatorAlertViewState.copy$default(applyMutation, null, null, null, false, null, interval, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
    }

    public final void fetchUiResource() {
        LifecycleHost.DefaultImpls.bind$default(this, this.alertStore.streamFirstAlertHubResource(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertDuxo.fetchUiResource$lambda$3(this.f$0, (AlertHubUiResources) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchUiResource$lambda$3(AlertHubCreateIndicatorAlertDuxo alertHubCreateIndicatorAlertDuxo, final AlertHubUiResources uiResource) {
        Intrinsics.checkNotNullParameter(uiResource, "uiResource");
        alertHubCreateIndicatorAlertDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertDuxo.fetchUiResource$lambda$3$lambda$2(uiResource, (AlertHubCreateIndicatorAlertViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertHubCreateIndicatorAlertViewState fetchUiResource$lambda$3$lambda$2(AlertHubUiResources alertHubUiResources, AlertHubCreateIndicatorAlertViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AlertHubCreateIndicatorAlertViewState.copy$default(applyMutation, null, null, null, false, null, null, alertHubUiResources, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertHubCreateIndicatorAlertViewState updateBottomTextPlaceholder$lambda$4(String str, AlertHubCreateIndicatorAlertViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AlertHubCreateIndicatorAlertViewState.copy$default(applyMutation, null, null, null, false, null, null, null, str, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public final void updateBottomTextPlaceholder(final String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        applyMutation(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertDuxo.updateBottomTextPlaceholder$lambda$4(text, (AlertHubCreateIndicatorAlertViewState) obj);
            }
        });
    }

    public final void createIndicatorAlert(ApiCreateIndicatorAlertItemRequest alertItem) {
        Intrinsics.checkNotNullParameter(alertItem, "alertItem");
        applyMutation(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertDuxo.createIndicatorAlert$lambda$5((AlertHubCreateIndicatorAlertViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.alertStore.createIndicatorAdvancedAlert(getInstrumentId(), alertItem), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertHubCreateIndicatorAlertDuxo.createIndicatorAlert$lambda$7(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertDuxo.createIndicatorAlert$lambda$9(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertHubCreateIndicatorAlertViewState createIndicatorAlert$lambda$5(AlertHubCreateIndicatorAlertViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AlertHubCreateIndicatorAlertViewState.copy$default(applyMutation, null, null, null, true, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createIndicatorAlert$lambda$7(AlertHubCreateIndicatorAlertDuxo alertHubCreateIndicatorAlertDuxo) {
        alertHubCreateIndicatorAlertDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertDuxo.createIndicatorAlert$lambda$7$lambda$6((AlertHubCreateIndicatorAlertViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertHubCreateIndicatorAlertViewState createIndicatorAlert$lambda$7$lambda$6(AlertHubCreateIndicatorAlertViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AlertHubCreateIndicatorAlertViewState.copy$default(applyMutation, null, new UiEvent(Unit.INSTANCE), null, false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createIndicatorAlert$lambda$9(AlertHubCreateIndicatorAlertDuxo alertHubCreateIndicatorAlertDuxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        alertHubCreateIndicatorAlertDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertDuxo.createIndicatorAlert$lambda$9$lambda$8(it, (AlertHubCreateIndicatorAlertViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertHubCreateIndicatorAlertViewState createIndicatorAlert$lambda$9$lambda$8(Throwable th, AlertHubCreateIndicatorAlertViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AlertHubCreateIndicatorAlertViewState.copy$default(applyMutation, null, null, new UiEvent(th), false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, null);
    }

    public final void updateIndicatorAlert(ApiCreateIndicatorAlertItemRequest alertItem) {
        Intrinsics.checkNotNullParameter(alertItem, "alertItem");
        applyMutation(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertDuxo.updateIndicatorAlert$lambda$10((AlertHubCreateIndicatorAlertViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.alertStore.updateIndicatorAdvancedAlert(getInstrumentId(), alertItem), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertHubCreateIndicatorAlertDuxo.updateIndicatorAlert$lambda$12(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertDuxo.updateIndicatorAlert$lambda$14(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertHubCreateIndicatorAlertViewState updateIndicatorAlert$lambda$10(AlertHubCreateIndicatorAlertViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AlertHubCreateIndicatorAlertViewState.copy$default(applyMutation, null, null, null, true, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateIndicatorAlert$lambda$12(AlertHubCreateIndicatorAlertDuxo alertHubCreateIndicatorAlertDuxo) {
        alertHubCreateIndicatorAlertDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertDuxo.updateIndicatorAlert$lambda$12$lambda$11((AlertHubCreateIndicatorAlertViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertHubCreateIndicatorAlertViewState updateIndicatorAlert$lambda$12$lambda$11(AlertHubCreateIndicatorAlertViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AlertHubCreateIndicatorAlertViewState.copy$default(applyMutation, null, new UiEvent(Unit.INSTANCE), null, false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateIndicatorAlert$lambda$14(AlertHubCreateIndicatorAlertDuxo alertHubCreateIndicatorAlertDuxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        alertHubCreateIndicatorAlertDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertDuxo.updateIndicatorAlert$lambda$14$lambda$13(it, (AlertHubCreateIndicatorAlertViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertHubCreateIndicatorAlertViewState updateIndicatorAlert$lambda$14$lambda$13(Throwable th, AlertHubCreateIndicatorAlertViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AlertHubCreateIndicatorAlertViewState.copy$default(applyMutation, null, null, new UiEvent(th), false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertHubCreateIndicatorAlertViewState deleteSetting$lambda$15(AlertHubCreateIndicatorAlertViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AlertHubCreateIndicatorAlertViewState.copy$default(applyMutation, null, null, null, true, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
    }

    public final void deleteSetting(String settingId) {
        Intrinsics.checkNotNullParameter(settingId, "settingId");
        applyMutation(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertDuxo.deleteSetting$lambda$15((AlertHubCreateIndicatorAlertViewState) obj);
            }
        });
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, this.alertStore.deleteAdvancedAlert(getInstrumentId(), ApiAdvancedAlert2.INSTRUMENTS, new ApiDeleteAdvancedAlertSettingRequest(CollectionsKt.listOf(new ApiDeleteAdvancedAlertSettingItemRequest(settingId)))), (LifecycleEvent) null, 1, (Object) null), null, new C83913(), new C83902(), 1, null);
    }

    /* compiled from: AlertHubCreateIndicatorAlertDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$deleteSetting$2 */
    static final class C83902 implements Action {
        C83902() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AlertHubCreateIndicatorAlertViewState run$lambda$0(AlertHubCreateIndicatorAlertViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return AlertHubCreateIndicatorAlertViewState.copy$default(applyMutation, null, new UiEvent(Unit.INSTANCE), null, false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, null);
        }

        @Override // io.reactivex.functions.Action
        public final void run() {
            AlertHubCreateIndicatorAlertDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$deleteSetting$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AlertHubCreateIndicatorAlertDuxo.C83902.run$lambda$0((AlertHubCreateIndicatorAlertViewState) obj);
                }
            });
        }
    }

    /* compiled from: AlertHubCreateIndicatorAlertDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$deleteSetting$3 */
    static final class C83913<T> implements Consumer {
        C83913() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(final Throwable th) {
            AlertHubCreateIndicatorAlertDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo$deleteSetting$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AlertHubCreateIndicatorAlertDuxo.C83913.accept$lambda$0(th, (AlertHubCreateIndicatorAlertViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AlertHubCreateIndicatorAlertViewState accept$lambda$0(Throwable th, AlertHubCreateIndicatorAlertViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return AlertHubCreateIndicatorAlertViewState.copy$default(applyMutation, null, null, new UiEvent(th), false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, null);
        }
    }

    public final ApiCreateIndicatorAlertItemRequest constructIndicatorAlertItemRequest(String alertId, AlertHubCreateIndicatorAlertViewState2 movingType, ApiAlertHubSettingItem.Interval intervalLength, String value) {
        Intrinsics.checkNotNullParameter(movingType, "movingType");
        Intrinsics.checkNotNullParameter(intervalLength, "intervalLength");
        Intrinsics.checkNotNullParameter(value, "value");
        ApiTechnicalIndicator technicalIndicator = getTechnicalIndicator();
        if (technicalIndicator instanceof ApiTechnicalIndicator.ApiSimpleMovingAverage) {
            ApiTechnicalIndicator technicalIndicator2 = getTechnicalIndicator();
            Intrinsics.checkNotNull(technicalIndicator2, "null cannot be cast to non-null type com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator.ApiSimpleMovingAverage");
            ApiTechnicalIndicator.ApiSimpleMovingAverage apiSimpleMovingAverage = (ApiTechnicalIndicator.ApiSimpleMovingAverage) technicalIndicator2;
            int i = WhenMappings.$EnumSwitchMapping$0[movingType.ordinal()];
            if (i == 1) {
                return new ApiCreateIndicatorAlertItemRequest.PriceAboveSma(alertId, true, apiSimpleMovingAverage.getPeriod(), intervalLength);
            }
            if (i == 2) {
                return new ApiCreateIndicatorAlertItemRequest.PriceBelowSma(alertId, true, apiSimpleMovingAverage.getPeriod(), intervalLength);
            }
            if (i == 3) {
                return new ApiCreateIndicatorAlertItemRequest.SmaAbove(alertId, true, apiSimpleMovingAverage.getPeriod(), intervalLength, value);
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return new ApiCreateIndicatorAlertItemRequest.SmaBelow(alertId, true, apiSimpleMovingAverage.getPeriod(), intervalLength, value);
        }
        if (technicalIndicator instanceof ApiTechnicalIndicator.ApiExponentialMovingAverage) {
            ApiTechnicalIndicator technicalIndicator3 = getTechnicalIndicator();
            Intrinsics.checkNotNull(technicalIndicator3, "null cannot be cast to non-null type com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator.ApiExponentialMovingAverage");
            ApiTechnicalIndicator.ApiExponentialMovingAverage apiExponentialMovingAverage = (ApiTechnicalIndicator.ApiExponentialMovingAverage) technicalIndicator3;
            int i2 = WhenMappings.$EnumSwitchMapping$0[movingType.ordinal()];
            if (i2 == 1) {
                return new ApiCreateIndicatorAlertItemRequest.PriceAboveEma(alertId, true, apiExponentialMovingAverage.getPeriod(), intervalLength);
            }
            if (i2 == 2) {
                return new ApiCreateIndicatorAlertItemRequest.PriceBelowEma(alertId, true, apiExponentialMovingAverage.getPeriod(), intervalLength);
            }
            if (i2 == 3) {
                return new ApiCreateIndicatorAlertItemRequest.EmaAbove(alertId, true, apiExponentialMovingAverage.getPeriod(), intervalLength, value);
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return new ApiCreateIndicatorAlertItemRequest.EmaBelow(alertId, true, apiExponentialMovingAverage.getPeriod(), intervalLength, value);
        }
        if (technicalIndicator instanceof ApiTechnicalIndicator.ApiRelativeStrengthIndex) {
            ApiTechnicalIndicator technicalIndicator4 = getTechnicalIndicator();
            Intrinsics.checkNotNull(technicalIndicator4, "null cannot be cast to non-null type com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator.ApiRelativeStrengthIndex");
            ApiTechnicalIndicator.ApiRelativeStrengthIndex apiRelativeStrengthIndex = (ApiTechnicalIndicator.ApiRelativeStrengthIndex) technicalIndicator4;
            int i3 = WhenMappings.$EnumSwitchMapping$0[movingType.ordinal()];
            if (i3 == 3) {
                int iIntValue = 70;
                int period = apiRelativeStrengthIndex.getPeriod();
                Integer overbought_level = apiRelativeStrengthIndex.getOverbought_level();
                if (overbought_level != null) {
                    iIntValue = overbought_level.intValue();
                }
                int i4 = iIntValue;
                Integer oversold_level = apiRelativeStrengthIndex.getOversold_level();
                return new ApiCreateIndicatorAlertItemRequest.RsiAbove(alertId, true, intervalLength, i4, oversold_level != null ? oversold_level.intValue() : 30, period, Double.parseDouble(value));
            }
            if (i3 == 4) {
                int iIntValue2 = 70;
                int period2 = apiRelativeStrengthIndex.getPeriod();
                Integer overbought_level2 = apiRelativeStrengthIndex.getOverbought_level();
                if (overbought_level2 != null) {
                    iIntValue2 = overbought_level2.intValue();
                }
                int i5 = iIntValue2;
                Integer oversold_level2 = apiRelativeStrengthIndex.getOversold_level();
                return new ApiCreateIndicatorAlertItemRequest.RsiBelow(alertId, true, intervalLength, i5, oversold_level2 != null ? oversold_level2.intValue() : 30, period2, Double.parseDouble(value));
            }
            return new ApiCreateIndicatorAlertItemRequest.Unknown(null, false, 3, null);
        }
        if (technicalIndicator instanceof ApiTechnicalIndicator.ApiVolumeWeightedAveragePrice) {
            int i6 = WhenMappings.$EnumSwitchMapping$0[movingType.ordinal()];
            if (i6 == 1) {
                return new ApiCreateIndicatorAlertItemRequest.PriceAboveVwap(alertId, true, intervalLength);
            }
            if (i6 == 2) {
                return new ApiCreateIndicatorAlertItemRequest.PriceBelowVwap(alertId, true, intervalLength);
            }
            if (i6 == 3) {
                return new ApiCreateIndicatorAlertItemRequest.VwapAbove(alertId, true, intervalLength, value);
            }
            if (i6 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return new ApiCreateIndicatorAlertItemRequest.VwapBelow(alertId, true, intervalLength, value);
        }
        if (technicalIndicator instanceof ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence) {
            ApiTechnicalIndicator technicalIndicator5 = getTechnicalIndicator();
            Intrinsics.checkNotNull(technicalIndicator5, "null cannot be cast to non-null type com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence");
            ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence apiMovingAverageConvergenceDivergence = (ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence) technicalIndicator5;
            int i7 = WhenMappings.$EnumSwitchMapping$0[movingType.ordinal()];
            if (i7 == 1) {
                return new ApiCreateIndicatorAlertItemRequest.MacdAboveSignal(alertId, true, intervalLength, apiMovingAverageConvergenceDivergence.getSignal_period(), apiMovingAverageConvergenceDivergence.getFast_period(), apiMovingAverageConvergenceDivergence.getSlow_period());
            }
            if (i7 == 2) {
                return new ApiCreateIndicatorAlertItemRequest.MacdBelowSignal(alertId, true, intervalLength, apiMovingAverageConvergenceDivergence.getSignal_period(), apiMovingAverageConvergenceDivergence.getFast_period(), apiMovingAverageConvergenceDivergence.getSlow_period());
            }
            return new ApiCreateIndicatorAlertItemRequest.Unknown(null, false, 3, null);
        }
        if (technicalIndicator instanceof ApiTechnicalIndicator.ApiBollingerBands) {
            ApiTechnicalIndicator technicalIndicator6 = getTechnicalIndicator();
            Intrinsics.checkNotNull(technicalIndicator6, "null cannot be cast to non-null type com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator.ApiBollingerBands");
            ApiTechnicalIndicator.ApiBollingerBands apiBollingerBands = (ApiTechnicalIndicator.ApiBollingerBands) technicalIndicator6;
            int i8 = WhenMappings.$EnumSwitchMapping$0[movingType.ordinal()];
            if (i8 == 1) {
                return new ApiCreateIndicatorAlertItemRequest.PriceAboveBollUpper(alertId, true, intervalLength, apiBollingerBands.getMa_type(), apiBollingerBands.getPeriod(), apiBollingerBands.getStd_dev());
            }
            if (i8 == 2) {
                return new ApiCreateIndicatorAlertItemRequest.PriceBelowBollLower(alertId, true, intervalLength, apiBollingerBands.getMa_type(), apiBollingerBands.getPeriod(), apiBollingerBands.getStd_dev());
            }
            return new ApiCreateIndicatorAlertItemRequest.Unknown(null, false, 3, null);
        }
        return new ApiCreateIndicatorAlertItemRequest.Unknown(null, false, 3, null);
    }

    public final InitialStateFromAlert getInitialStateFromAlert(AlertHubSettingItem alert) {
        AlertHubCreateIndicatorAlertViewState2 alertHubCreateIndicatorAlertViewState2;
        ApiAlertHubSettingItem.Interval interval;
        ApiAlertHubSettingItem.Interval interval2;
        BigDecimal value;
        Intrinsics.checkNotNullParameter(alert, "alert");
        BigDecimal bigDecimal = null;
        if (alert instanceof AlertHubSettingItem.PriceAboveSma) {
            alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.CROSSES_ABOVE;
            interval = ((AlertHubSettingItem.PriceAboveSma) alert).getInterval();
        } else if (alert instanceof AlertHubSettingItem.PriceBelowSma) {
            alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.CROSSES_BELOW;
            interval = ((AlertHubSettingItem.PriceBelowSma) alert).getInterval();
        } else {
            if (alert instanceof AlertHubSettingItem.SmaAbove) {
                alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.MOVE_ABOVE_VALUE;
                AlertHubSettingItem.SmaAbove smaAbove = (AlertHubSettingItem.SmaAbove) alert;
                interval2 = smaAbove.getInterval();
                value = smaAbove.getValue();
            } else if (alert instanceof AlertHubSettingItem.SmaBelow) {
                alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.MOVE_BELOW_VALUE;
                AlertHubSettingItem.SmaBelow smaBelow = (AlertHubSettingItem.SmaBelow) alert;
                interval2 = smaBelow.getInterval();
                value = smaBelow.getValue();
            } else if (alert instanceof AlertHubSettingItem.PriceAboveEma) {
                alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.CROSSES_ABOVE;
                interval = ((AlertHubSettingItem.PriceAboveEma) alert).getInterval();
            } else if (alert instanceof AlertHubSettingItem.PriceBelowEma) {
                alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.CROSSES_BELOW;
                interval = ((AlertHubSettingItem.PriceBelowEma) alert).getInterval();
            } else if (alert instanceof AlertHubSettingItem.EmaAbove) {
                alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.MOVE_ABOVE_VALUE;
                AlertHubSettingItem.EmaAbove emaAbove = (AlertHubSettingItem.EmaAbove) alert;
                interval2 = emaAbove.getInterval();
                value = emaAbove.getValue();
            } else if (alert instanceof AlertHubSettingItem.EmaBelow) {
                alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.MOVE_BELOW_VALUE;
                AlertHubSettingItem.EmaBelow emaBelow = (AlertHubSettingItem.EmaBelow) alert;
                interval2 = emaBelow.getInterval();
                value = emaBelow.getValue();
            } else if (alert instanceof AlertHubSettingItem.RsiAbove) {
                alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.MOVE_ABOVE_VALUE;
                AlertHubSettingItem.RsiAbove rsiAbove = (AlertHubSettingItem.RsiAbove) alert;
                interval2 = rsiAbove.getInterval();
                value = rsiAbove.getValue();
            } else if (alert instanceof AlertHubSettingItem.RsiBelow) {
                alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.MOVE_ABOVE_VALUE;
                AlertHubSettingItem.RsiBelow rsiBelow = (AlertHubSettingItem.RsiBelow) alert;
                interval2 = rsiBelow.getInterval();
                value = rsiBelow.getValue();
            } else if (alert instanceof AlertHubSettingItem.PriceAboveVwap) {
                alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.CROSSES_ABOVE;
                interval = ApiAlertHubSettingItem.Interval.FIVE_MINUTES;
            } else if (alert instanceof AlertHubSettingItem.PriceBelowVwap) {
                alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.CROSSES_BELOW;
                interval = ApiAlertHubSettingItem.Interval.FIVE_MINUTES;
            } else if (alert instanceof AlertHubSettingItem.VwapAbove) {
                alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.MOVE_ABOVE_VALUE;
                interval2 = ApiAlertHubSettingItem.Interval.FIVE_MINUTES;
                value = ((AlertHubSettingItem.VwapAbove) alert).getValue();
            } else if (alert instanceof AlertHubSettingItem.VwapBelow) {
                alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.MOVE_BELOW_VALUE;
                interval2 = ApiAlertHubSettingItem.Interval.FIVE_MINUTES;
                value = ((AlertHubSettingItem.VwapBelow) alert).getValue();
            } else if (alert instanceof AlertHubSettingItem.MacdAboveSignal) {
                alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.CROSSES_ABOVE;
                interval = ((AlertHubSettingItem.MacdAboveSignal) alert).getInterval();
            } else if (alert instanceof AlertHubSettingItem.MacdBelowSignal) {
                alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.CROSSES_BELOW;
                interval = ((AlertHubSettingItem.MacdBelowSignal) alert).getInterval();
            } else if (alert instanceof AlertHubSettingItem.PriceAboveBollUpper) {
                alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.CROSSES_ABOVE;
                interval = ((AlertHubSettingItem.PriceAboveBollUpper) alert).getInterval();
            } else if (alert instanceof AlertHubSettingItem.PriceBelowBollLower) {
                alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.CROSSES_BELOW;
                interval = ((AlertHubSettingItem.PriceBelowBollLower) alert).getInterval();
            } else {
                alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.CROSSES_ABOVE;
                interval = ApiAlertHubSettingItem.Interval.FIVE_MINUTES;
            }
            ApiAlertHubSettingItem.Interval interval3 = interval2;
            bigDecimal = value;
            interval = interval3;
        }
        return new InitialStateFromAlert(bigDecimal, interval, alertHubCreateIndicatorAlertViewState2);
    }

    /* compiled from: AlertHubCreateIndicatorAlertDuxo.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthub/AlertHubCreateIndicatorAlertDuxo$InitialStateFromAlert;", "", "value", "Ljava/math/BigDecimal;", "interval", "Lcom/robinhood/models/advanced/alert/api/ApiAlertHubSettingItem$Interval;", "moveType", "Lcom/robinhood/android/advanced/alert/alerthub/IndicatorMovingType;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/advanced/alert/api/ApiAlertHubSettingItem$Interval;Lcom/robinhood/android/advanced/alert/alerthub/IndicatorMovingType;)V", "getValue", "()Ljava/math/BigDecimal;", "getInterval", "()Lcom/robinhood/models/advanced/alert/api/ApiAlertHubSettingItem$Interval;", "getMoveType", "()Lcom/robinhood/android/advanced/alert/alerthub/IndicatorMovingType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitialStateFromAlert {
        public static final int $stable = 8;
        private final ApiAlertHubSettingItem.Interval interval;
        private final AlertHubCreateIndicatorAlertViewState2 moveType;
        private final BigDecimal value;

        public static /* synthetic */ InitialStateFromAlert copy$default(InitialStateFromAlert initialStateFromAlert, BigDecimal bigDecimal, ApiAlertHubSettingItem.Interval interval, AlertHubCreateIndicatorAlertViewState2 alertHubCreateIndicatorAlertViewState2, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = initialStateFromAlert.value;
            }
            if ((i & 2) != 0) {
                interval = initialStateFromAlert.interval;
            }
            if ((i & 4) != 0) {
                alertHubCreateIndicatorAlertViewState2 = initialStateFromAlert.moveType;
            }
            return initialStateFromAlert.copy(bigDecimal, interval, alertHubCreateIndicatorAlertViewState2);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiAlertHubSettingItem.Interval getInterval() {
            return this.interval;
        }

        /* renamed from: component3, reason: from getter */
        public final AlertHubCreateIndicatorAlertViewState2 getMoveType() {
            return this.moveType;
        }

        public final InitialStateFromAlert copy(BigDecimal value, ApiAlertHubSettingItem.Interval interval, AlertHubCreateIndicatorAlertViewState2 moveType) {
            Intrinsics.checkNotNullParameter(interval, "interval");
            Intrinsics.checkNotNullParameter(moveType, "moveType");
            return new InitialStateFromAlert(value, interval, moveType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitialStateFromAlert)) {
                return false;
            }
            InitialStateFromAlert initialStateFromAlert = (InitialStateFromAlert) other;
            return Intrinsics.areEqual(this.value, initialStateFromAlert.value) && this.interval == initialStateFromAlert.interval && this.moveType == initialStateFromAlert.moveType;
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.value;
            return ((((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31) + this.interval.hashCode()) * 31) + this.moveType.hashCode();
        }

        public String toString() {
            return "InitialStateFromAlert(value=" + this.value + ", interval=" + this.interval + ", moveType=" + this.moveType + ")";
        }

        public InitialStateFromAlert(BigDecimal bigDecimal, ApiAlertHubSettingItem.Interval interval, AlertHubCreateIndicatorAlertViewState2 moveType) {
            Intrinsics.checkNotNullParameter(interval, "interval");
            Intrinsics.checkNotNullParameter(moveType, "moveType");
            this.value = bigDecimal;
            this.interval = interval;
            this.moveType = moveType;
        }

        public final BigDecimal getValue() {
            return this.value;
        }

        public final ApiAlertHubSettingItem.Interval getInterval() {
            return this.interval;
        }

        public final AlertHubCreateIndicatorAlertViewState2 getMoveType() {
            return this.moveType;
        }
    }

    /* compiled from: AlertHubCreateIndicatorAlertDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthub/AlertHubCreateIndicatorAlertDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advanced/alert/alerthub/AlertHubCreateIndicatorAlertDuxo;", "Lcom/robinhood/android/education/contracts/AlertHubCreateIndicatorAlert;", "<init>", "()V", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AlertHubCreateIndicatorAlertDuxo, AlertHubCreateIndicatorAlert> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AlertHubCreateIndicatorAlert getArgs(SavedStateHandle savedStateHandle) {
            return (AlertHubCreateIndicatorAlert) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AlertHubCreateIndicatorAlert getArgs(AlertHubCreateIndicatorAlertDuxo alertHubCreateIndicatorAlertDuxo) {
            return (AlertHubCreateIndicatorAlert) DuxoCompanion.DefaultImpls.getArgs(this, alertHubCreateIndicatorAlertDuxo);
        }
    }
}
