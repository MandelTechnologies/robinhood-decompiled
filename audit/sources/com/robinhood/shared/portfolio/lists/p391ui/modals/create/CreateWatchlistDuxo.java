package com.robinhood.shared.portfolio.lists.p391ui.modals.create;

import androidx.lifecycle.ViewModel2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.shared.portfolio.lists.p391ui.modals.create.CreateWatchlistDuxo;
import com.robinhood.shared.portfolio.lists.p391ui.modals.create.CreateWatchlistDuxo6;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreateWatchlistDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreateWatchlistDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreateWatchlistViewState;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/store/lists/store/CuratedListStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "setEmojiPickerVisible", "", "visibility", "", "onListNameChange", "listName", "", "createNewWatchlist", "setIconEmoji", AnalyticsStrings.BUTTON_DESCRIPTION_LIST_EMOJI, "reset", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CreateWatchlistDuxo extends BaseDuxo4<CreateWatchlistViewState> {
    public static final int $stable = 8;
    private final CuratedListStore curatedListStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateWatchlistDuxo(CuratedListStore curatedListStore, DuxoBundle duxoBundle) {
        super(new CreateWatchlistViewState(null, null, false, null, null, 31, null), duxoBundle);
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.curatedListStore = curatedListStore;
    }

    /* compiled from: CreateWatchlistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreateWatchlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistDuxo$setEmojiPickerVisible$1", m3645f = "CreateWatchlistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistDuxo$setEmojiPickerVisible$1 */
    static final class C394631 extends ContinuationImpl7 implements Function2<CreateWatchlistViewState, Continuation<? super CreateWatchlistViewState>, Object> {
        final /* synthetic */ boolean $visibility;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C394631(boolean z, Continuation<? super C394631> continuation) {
            super(2, continuation);
            this.$visibility = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C394631 c394631 = new C394631(this.$visibility, continuation);
            c394631.L$0 = obj;
            return c394631;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateWatchlistViewState createWatchlistViewState, Continuation<? super CreateWatchlistViewState> continuation) {
            return ((C394631) create(createWatchlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CreateWatchlistViewState.copy$default((CreateWatchlistViewState) this.L$0, null, null, this.$visibility, null, null, 27, null);
        }
    }

    public final void setEmojiPickerVisible(boolean visibility) {
        applyMutation(new C394631(visibility, null));
    }

    /* compiled from: CreateWatchlistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreateWatchlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistDuxo$onListNameChange$1", m3645f = "CreateWatchlistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistDuxo$onListNameChange$1 */
    static final class C394611 extends ContinuationImpl7 implements Function2<CreateWatchlistViewState, Continuation<? super CreateWatchlistViewState>, Object> {
        final /* synthetic */ String $listName;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C394611(String str, Continuation<? super C394611> continuation) {
            super(2, continuation);
            this.$listName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C394611 c394611 = new C394611(this.$listName, continuation);
            c394611.L$0 = obj;
            return c394611;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateWatchlistViewState createWatchlistViewState, Continuation<? super CreateWatchlistViewState> continuation) {
            return ((C394611) create(createWatchlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CreateWatchlistViewState.copy$default((CreateWatchlistViewState) this.L$0, this.$listName, null, false, null, null, 30, null);
        }
    }

    public final void onListNameChange(String listName) {
        Intrinsics.checkNotNullParameter(listName, "listName");
        applyMutation(new C394611(listName, null));
    }

    /* compiled from: CreateWatchlistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreateWatchlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistDuxo$createNewWatchlist$1", m3645f = "CreateWatchlistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistDuxo$createNewWatchlist$1 */
    static final class C394591 extends ContinuationImpl7 implements Function2<CreateWatchlistViewState, Continuation<? super CreateWatchlistViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C394591(Continuation<? super C394591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C394591 c394591 = new C394591(continuation);
            c394591.L$0 = obj;
            return c394591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateWatchlistViewState createWatchlistViewState, Continuation<? super CreateWatchlistViewState> continuation) {
            return ((C394591) create(createWatchlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CreateWatchlistViewState.copy$default((CreateWatchlistViewState) this.L$0, null, null, false, null, CreateWatchlistDuxo6.Creating.INSTANCE, 15, null);
        }
    }

    /* compiled from: CreateWatchlistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistDuxo$createNewWatchlist$2", m3645f = "CreateWatchlistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistDuxo$createNewWatchlist$2 */
    static final class C394602 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C394602(Continuation<? super C394602> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateWatchlistDuxo.this.new C394602(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C394602) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateWatchlistViewState value = CreateWatchlistDuxo.this.getStateFlow().getValue();
            final CreateWatchlistDuxo createWatchlistDuxo = CreateWatchlistDuxo.this;
            CreateWatchlistViewState createWatchlistViewState = value;
            LifecycleHost.DefaultImpls.bind$default(createWatchlistDuxo, createWatchlistDuxo.curatedListStore.createCuratedList(createWatchlistViewState.getListName(), createWatchlistViewState.getIconEmoji()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistDuxo$createNewWatchlist$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CreateWatchlistDuxo.C394602.invokeSuspend$lambda$2$lambda$0(createWatchlistDuxo, (CuratedList) obj2);
                }
            }, new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistDuxo$createNewWatchlist$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CreateWatchlistDuxo.C394602.invokeSuspend$lambda$2$lambda$1(createWatchlistDuxo, (Throwable) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2$lambda$0(CreateWatchlistDuxo createWatchlistDuxo, CuratedList curatedList) {
            createWatchlistDuxo.applyMutation(new CreateWatchlistDuxo2(curatedList, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2$lambda$1(CreateWatchlistDuxo createWatchlistDuxo, Throwable th) {
            ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(th);
            GenericErrorResponse genericErrorResponse = errorResponseExtractErrorResponse instanceof GenericErrorResponse ? (GenericErrorResponse) errorResponseExtractErrorResponse : null;
            String displayErrorText = genericErrorResponse != null ? genericErrorResponse.getDisplayErrorText() : null;
            if (displayErrorText != null) {
                createWatchlistDuxo.applyMutation(new CreateWatchlistDuxo3(displayErrorText, null));
            } else {
                createWatchlistDuxo.applyMutation(new CreateWatchlistDuxo4(null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void createNewWatchlist() {
        applyMutation(new C394591(null));
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C394602(null), 3, null);
    }

    /* compiled from: CreateWatchlistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreateWatchlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistDuxo$setIconEmoji$1", m3645f = "CreateWatchlistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistDuxo$setIconEmoji$1 */
    static final class C394641 extends ContinuationImpl7 implements Function2<CreateWatchlistViewState, Continuation<? super CreateWatchlistViewState>, Object> {
        final /* synthetic */ String $emoji;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C394641(String str, Continuation<? super C394641> continuation) {
            super(2, continuation);
            this.$emoji = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C394641 c394641 = new C394641(this.$emoji, continuation);
            c394641.L$0 = obj;
            return c394641;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateWatchlistViewState createWatchlistViewState, Continuation<? super CreateWatchlistViewState> continuation) {
            return ((C394641) create(createWatchlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CreateWatchlistViewState.copy$default((CreateWatchlistViewState) this.L$0, null, this.$emoji, false, null, null, 29, null);
        }
    }

    public final void setIconEmoji(String emoji) {
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        applyMutation(new C394641(emoji, null));
    }

    /* compiled from: CreateWatchlistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreateWatchlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistDuxo$reset$1", m3645f = "CreateWatchlistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistDuxo$reset$1 */
    static final class C394621 extends ContinuationImpl7 implements Function2<CreateWatchlistViewState, Continuation<? super CreateWatchlistViewState>, Object> {
        int label;

        C394621(Continuation<? super C394621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C394621(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateWatchlistViewState createWatchlistViewState, Continuation<? super CreateWatchlistViewState> continuation) {
            return ((C394621) create(createWatchlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new CreateWatchlistViewState(null, null, false, null, null, 31, null);
        }
    }

    public final void reset() {
        applyMutation(new C394621(null));
    }
}
