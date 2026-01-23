package com.robinhood.android.odyssey.lib.template.citizen;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.serverdrivenui.component.ApiSdOption;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SdSearchCitizenSelectorDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/citizen/SdSearchCitizenSelectorDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/odyssey/lib/template/citizen/SdSearchCitizenSelectorViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onSearch", "", "input", "", "onSelectChange", "citizen", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class SdSearchCitizenSelectorDuxo extends BaseDuxo4<SdSearchCitizenSelectorViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SdSearchCitizenSelectorDuxo(SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new SdSearchCitizenSelectorViewState(((SdSearchCitizenSelectorFragmentKey) companion.getArgs(savedStateHandle)).getTitle(), ((SdSearchCitizenSelectorFragmentKey) companion.getArgs(savedStateHandle)).getPlaceholder(), ((SdSearchCitizenSelectorFragmentKey) companion.getArgs(savedStateHandle)).getSelectedInput(), ((SdSearchCitizenSelectorFragmentKey) companion.getArgs(savedStateHandle)).getSearchInputOptions(), ((SdSearchCitizenSelectorFragmentKey) companion.getArgs(savedStateHandle)).getSearchInputOptions()), duxoBundle);
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: SdSearchCitizenSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/odyssey/lib/template/citizen/SdSearchCitizenSelectorViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorDuxo$onSearch$1", m3645f = "SdSearchCitizenSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorDuxo$onSearch$1 */
    static final class C227031 extends ContinuationImpl7 implements Function2<SdSearchCitizenSelectorViewState, Continuation<? super SdSearchCitizenSelectorViewState>, Object> {
        final /* synthetic */ String $input;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C227031(String str, Continuation<? super C227031> continuation) {
            super(2, continuation);
            this.$input = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C227031 c227031 = new C227031(this.$input, continuation);
            c227031.L$0 = obj;
            return c227031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SdSearchCitizenSelectorViewState sdSearchCitizenSelectorViewState, Continuation<? super SdSearchCitizenSelectorViewState> continuation) {
            return ((C227031) create(sdSearchCitizenSelectorViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final SdSearchCitizenSelectorViewState sdSearchCitizenSelectorViewState = (SdSearchCitizenSelectorViewState) this.L$0;
            ImmutableList3<ApiSdOption> allAvailableOptions = sdSearchCitizenSelectorViewState.getAllAvailableOptions();
            String str = this.$input;
            ArrayList arrayList = new ArrayList();
            for (ApiSdOption apiSdOption : allAvailableOptions) {
                if (StringsKt.isBlank(str) ? true : StringsKt.startsWith(apiSdOption.getDisplay_label(), str, true)) {
                    arrayList.add(apiSdOption);
                }
            }
            return SdSearchCitizenSelectorViewState.copy$default(sdSearchCitizenSelectorViewState, null, null, null, extensions2.toPersistentList(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorDuxo$onSearch$1$invokeSuspend$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Boolean.valueOf(Intrinsics.areEqual((ApiSdOption) t2, sdSearchCitizenSelectorViewState.getSelectedOption())), Boolean.valueOf(Intrinsics.areEqual((ApiSdOption) t, sdSearchCitizenSelectorViewState.getSelectedOption())));
                }
            })), null, 23, null);
        }
    }

    public final void onSearch(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        applyMutation(new C227031(input, null));
    }

    /* compiled from: SdSearchCitizenSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/odyssey/lib/template/citizen/SdSearchCitizenSelectorViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorDuxo$onSelectChange$1", m3645f = "SdSearchCitizenSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorDuxo$onSelectChange$1 */
    static final class C227041 extends ContinuationImpl7 implements Function2<SdSearchCitizenSelectorViewState, Continuation<? super SdSearchCitizenSelectorViewState>, Object> {
        final /* synthetic */ ApiSdOption $citizen;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C227041(ApiSdOption apiSdOption, Continuation<? super C227041> continuation) {
            super(2, continuation);
            this.$citizen = apiSdOption;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C227041 c227041 = new C227041(this.$citizen, continuation);
            c227041.L$0 = obj;
            return c227041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SdSearchCitizenSelectorViewState sdSearchCitizenSelectorViewState, Continuation<? super SdSearchCitizenSelectorViewState> continuation) {
            return ((C227041) create(sdSearchCitizenSelectorViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SdSearchCitizenSelectorViewState.copy$default((SdSearchCitizenSelectorViewState) this.L$0, null, null, this.$citizen, null, null, 27, null);
        }
    }

    public final void onSelectChange(ApiSdOption citizen) {
        Intrinsics.checkNotNullParameter(citizen, "citizen");
        applyMutation(new C227041(citizen, null));
    }

    /* compiled from: SdSearchCitizenSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/citizen/SdSearchCitizenSelectorDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/odyssey/lib/template/citizen/SdSearchCitizenSelectorDuxo;", "Lcom/robinhood/android/odyssey/lib/template/citizen/SdSearchCitizenSelectorFragmentKey;", "<init>", "()V", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SdSearchCitizenSelectorDuxo, SdSearchCitizenSelectorFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SdSearchCitizenSelectorFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (SdSearchCitizenSelectorFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SdSearchCitizenSelectorFragmentKey getArgs(SdSearchCitizenSelectorDuxo sdSearchCitizenSelectorDuxo) {
            return (SdSearchCitizenSelectorFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, sdSearchCitizenSelectorDuxo);
        }
    }
}
