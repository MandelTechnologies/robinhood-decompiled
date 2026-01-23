package com.robinhood.iac.alertsheet.p295ui;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.iac.alertsheet.IacAlertSheetStore;
import com.robinhood.models.api.ApiIacAlertSheetAction;
import com.robinhood.models.api.ApiIacAlertSheetActionRequest;
import com.robinhood.models.api.ApiIacAlertSheetDismissRequest;
import com.robinhood.models.api.IacAlertSheetDismissMethod;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IacAlertSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001fB)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u001e\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "iacAlertSheetStore", "Lcom/robinhood/iac/alertsheet/IacAlertSheetStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/iac/alertsheet/IacAlertSheetStore;Lcom/robinhood/android/navigation/Navigator;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "onDeepLinkClicked", "", "action", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "postItemSeen", "postItemAction", "", "postItemDismissed", "postItemDismissedPassive", "Companion", "lib-iac-alert-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class IacAlertSheetDuxo extends BaseDuxo4<IacAlertSheetViewState> implements HasSavedState {
    private final IacAlertSheetStore iacAlertSheetStore;
    private final UUID id;
    private final Navigator navigator;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IacAlertSheetDuxo(IacAlertSheetStore iacAlertSheetStore, Navigator navigator, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(iacAlertSheetStore, "iacAlertSheetStore");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new IacAlertSheetViewState(((LegacyDialogFragmentKey.IacAlertSheet) companion.getArgs(savedStateHandle)).getIacBottomSheet()), duxoBundle);
        this.iacAlertSheetStore = iacAlertSheetStore;
        this.navigator = navigator;
        this.savedStateHandle = savedStateHandle;
        this.id = ((LegacyDialogFragmentKey.IacAlertSheet) companion.getArgs(getSavedStateHandle())).getIacBottomSheet().getId();
    }

    public final UUID getId() {
        return this.id;
    }

    public final void onDeepLinkClicked(Uri action, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (action != null) {
            Navigator.DefaultImpls.handleDeepLink$default(this.navigator, context, action, Boolean.TRUE, null, false, null, 56, null);
        }
    }

    /* compiled from: IacAlertSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.iac.alertsheet.ui.IacAlertSheetDuxo$postItemSeen$1", m3645f = "IacAlertSheetDuxo.kt", m3646l = {43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.iac.alertsheet.ui.IacAlertSheetDuxo$postItemSeen$1 */
    static final class C333431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C333431(UUID uuid, Continuation<? super C333431> continuation) {
            super(2, continuation);
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IacAlertSheetDuxo.this.new C333431(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C333431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IacAlertSheetStore iacAlertSheetStore = IacAlertSheetDuxo.this.iacAlertSheetStore;
                UUID uuid = this.$id;
                this.label = 1;
                if (iacAlertSheetStore.postItemSeen(uuid, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void postItemSeen(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C333431(id, null), 3, null);
    }

    /* compiled from: IacAlertSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.iac.alertsheet.ui.IacAlertSheetDuxo$postItemAction$1", m3645f = "IacAlertSheetDuxo.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.iac.alertsheet.ui.IacAlertSheetDuxo$postItemAction$1 */
    static final class C333401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $action;
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C333401(UUID uuid, String str, Continuation<? super C333401> continuation) {
            super(2, continuation);
            this.$id = uuid;
            this.$action = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IacAlertSheetDuxo.this.new C333401(this.$id, this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C333401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IacAlertSheetStore iacAlertSheetStore = IacAlertSheetDuxo.this.iacAlertSheetStore;
                ApiIacAlertSheetActionRequest apiIacAlertSheetActionRequest = new ApiIacAlertSheetActionRequest(this.$id, new ApiIacAlertSheetAction(this.$action));
                this.label = 1;
                if (iacAlertSheetStore.postItemAction(apiIacAlertSheetActionRequest, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void postItemAction(UUID id, String action) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(action, "action");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C333401(id, action, null), 3, null);
    }

    /* compiled from: IacAlertSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.iac.alertsheet.ui.IacAlertSheetDuxo$postItemDismissed$1", m3645f = "IacAlertSheetDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.iac.alertsheet.ui.IacAlertSheetDuxo$postItemDismissed$1 */
    static final class C333411 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C333411(UUID uuid, Continuation<? super C333411> continuation) {
            super(2, continuation);
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IacAlertSheetDuxo.this.new C333411(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C333411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IacAlertSheetStore iacAlertSheetStore = IacAlertSheetDuxo.this.iacAlertSheetStore;
                ApiIacAlertSheetDismissRequest apiIacAlertSheetDismissRequest = new ApiIacAlertSheetDismissRequest(this.$id, IacAlertSheetDismissMethod.CTA);
                this.label = 1;
                if (iacAlertSheetStore.postItemDismissed(apiIacAlertSheetDismissRequest, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void postItemDismissed(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C333411(id, null), 3, null);
    }

    /* compiled from: IacAlertSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.iac.alertsheet.ui.IacAlertSheetDuxo$postItemDismissedPassive$1", m3645f = "IacAlertSheetDuxo.kt", m3646l = {65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.iac.alertsheet.ui.IacAlertSheetDuxo$postItemDismissedPassive$1 */
    static final class C333421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C333421(Continuation<? super C333421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IacAlertSheetDuxo.this.new C333421(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C333421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IacAlertSheetStore iacAlertSheetStore = IacAlertSheetDuxo.this.iacAlertSheetStore;
                ApiIacAlertSheetDismissRequest apiIacAlertSheetDismissRequest = new ApiIacAlertSheetDismissRequest(IacAlertSheetDuxo.this.getId(), IacAlertSheetDismissMethod.PASSIVE);
                this.label = 1;
                if (iacAlertSheetStore.postItemDismissed(apiIacAlertSheetDismissRequest, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void postItemDismissedPassive() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C333421(null), 3, null);
    }

    /* compiled from: IacAlertSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$IacAlertSheet;", "<init>", "()V", "lib-iac-alert-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<IacAlertSheetDuxo, LegacyDialogFragmentKey.IacAlertSheet> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyDialogFragmentKey.IacAlertSheet getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyDialogFragmentKey.IacAlertSheet) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyDialogFragmentKey.IacAlertSheet getArgs(IacAlertSheetDuxo iacAlertSheetDuxo) {
            return (LegacyDialogFragmentKey.IacAlertSheet) DuxoCompanion.DefaultImpls.getArgs(this, iacAlertSheetDuxo);
        }
    }
}
