package com.robinhood.android.doc.serverdriven.regionselector;

import androidx.lifecycle.SavedStateHandle;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.iso.countrycode.CountryCode;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields4;
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

/* compiled from: SddrRegionSelectorDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorDataState;", "Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "stateProvider", "Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "filter", "query", "", Fields4.TYPE, PlaceTypes.COUNTRY, "Lcom/robinhood/iso/countrycode/CountryCode;", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class SddrRegionSelectorDuxo extends BaseDuxo<SddrRegionSelectorDataState, SddrRegionSelectorViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SddrRegionSelectorDuxo(SddrRegionSelectorStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new SddrRegionSelectorDataState(null, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        applyMutation(new C143141(null));
    }

    /* compiled from: SddrRegionSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorDuxo$onCreate$1", m3645f = "SddrRegionSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorDuxo$onCreate$1 */
    static final class C143141 extends ContinuationImpl7 implements Function2<SddrRegionSelectorDataState, Continuation<? super SddrRegionSelectorDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C143141(Continuation<? super C143141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C143141 c143141 = SddrRegionSelectorDuxo.this.new C143141(continuation);
            c143141.L$0 = obj;
            return c143141;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SddrRegionSelectorDataState sddrRegionSelectorDataState, Continuation<? super SddrRegionSelectorDataState> continuation) {
            return ((C143141) create(sddrRegionSelectorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SddrRegionSelectorDataState sddrRegionSelectorDataState = (SddrRegionSelectorDataState) this.L$0;
            Companion companion = SddrRegionSelectorDuxo.INSTANCE;
            return SddrRegionSelectorDataState.copy$default(sddrRegionSelectorDataState, ((SddrRegionSelectorFragment.Args) companion.getArgs((HasSavedState) SddrRegionSelectorDuxo.this)).getSelected(), ((SddrRegionSelectorFragment.Args) companion.getArgs((HasSavedState) SddrRegionSelectorDuxo.this)).getOptions(), null, 4, null);
        }
    }

    /* compiled from: SddrRegionSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorDuxo$filter$1", m3645f = "SddrRegionSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorDuxo$filter$1 */
    static final class C143131 extends ContinuationImpl7 implements Function2<SddrRegionSelectorDataState, Continuation<? super SddrRegionSelectorDataState>, Object> {
        final /* synthetic */ String $query;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C143131(String str, Continuation<? super C143131> continuation) {
            super(2, continuation);
            this.$query = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C143131 c143131 = new C143131(this.$query, continuation);
            c143131.L$0 = obj;
            return c143131;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SddrRegionSelectorDataState sddrRegionSelectorDataState, Continuation<? super SddrRegionSelectorDataState> continuation) {
            return ((C143131) create(sddrRegionSelectorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SddrRegionSelectorDataState.copy$default((SddrRegionSelectorDataState) this.L$0, null, null, this.$query, 3, null);
        }
    }

    public final void filter(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        applyMutation(new C143131(query, null));
    }

    /* compiled from: SddrRegionSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorDuxo$select$1", m3645f = "SddrRegionSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorDuxo$select$1 */
    static final class C143151 extends ContinuationImpl7 implements Function2<SddrRegionSelectorDataState, Continuation<? super SddrRegionSelectorDataState>, Object> {
        final /* synthetic */ CountryCode $country;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C143151(CountryCode countryCode, Continuation<? super C143151> continuation) {
            super(2, continuation);
            this.$country = countryCode;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C143151 c143151 = new C143151(this.$country, continuation);
            c143151.L$0 = obj;
            return c143151;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SddrRegionSelectorDataState sddrRegionSelectorDataState, Continuation<? super SddrRegionSelectorDataState> continuation) {
            return ((C143151) create(sddrRegionSelectorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SddrRegionSelectorDataState.copy$default((SddrRegionSelectorDataState) this.L$0, this.$country, null, null, 6, null);
        }
    }

    public final void select(CountryCode country) {
        Intrinsics.checkNotNullParameter(country, "country");
        applyMutation(new C143151(country, null));
    }

    /* compiled from: SddrRegionSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorDuxo;", "Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorFragment$Args;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SddrRegionSelectorDuxo, SddrRegionSelectorFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SddrRegionSelectorFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (SddrRegionSelectorFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SddrRegionSelectorFragment.Args getArgs(SddrRegionSelectorDuxo sddrRegionSelectorDuxo) {
            return (SddrRegionSelectorFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, sddrRegionSelectorDuxo);
        }
    }
}
