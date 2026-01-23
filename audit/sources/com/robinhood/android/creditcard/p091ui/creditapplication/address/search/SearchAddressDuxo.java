package com.robinhood.android.creditcard.p091ui.creditapplication.address.search;

import androidx.lifecycle.ViewModel2;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.robinhood.android.creditcard.p091ui.creditapplication.address.search.SearchAddressDuxo3;
import com.robinhood.android.creditcard.p091ui.creditapplication.address.search.utils.Places3;
import com.robinhood.android.creditcard.store.places.PlacesStore;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.logging.CrashReporter;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: SearchAddressDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/address/search/SearchAddressDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/search/SearchAddressViewState;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/search/SearchAddressEvent;", "placesStore", "Lcom/robinhood/android/creditcard/store/places/PlacesStore;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/creditcard/store/places/PlacesStore;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/robinhood/android/udf/DuxoBundle;)V", "queryChanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "sessionToken", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "setQuery", "", "input", "setSessionToken", "onDismissError", "onAddressPress", "placeId", "", "onCreate", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class SearchAddressDuxo extends BaseDuxo5<SearchAddressViewState, SearchAddressDuxo3> {
    private static final long INPUT_DEBOUNCE_MILLISECONDS = 500;
    private static final int QUERY_THRESHOLD = 2;
    private final CoroutineDispatcher defaultDispatcher;
    private final PlacesStore placesStore;
    private final StateFlow2<CharSequence> queryChanges;
    private AutocompleteSessionToken sessionToken;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchAddressDuxo(PlacesStore placesStore, @DefaultDispatcher CoroutineDispatcher defaultDispatcher, DuxoBundle duxoBundle) {
        super(new SearchAddressViewState(false, null, false, 7, null), duxoBundle);
        Intrinsics.checkNotNullParameter(placesStore, "placesStore");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.placesStore = placesStore;
        this.defaultDispatcher = defaultDispatcher;
        this.queryChanges = StateFlow4.MutableStateFlow("");
    }

    public final void setQuery(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.queryChanges.tryEmit(input);
    }

    public final void setSessionToken(AutocompleteSessionToken sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        this.sessionToken = sessionToken;
    }

    /* compiled from: SearchAddressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/search/SearchAddressViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onDismissError$1", m3645f = "SearchAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onDismissError$1 */
    static final class C122901 extends ContinuationImpl7 implements Function2<SearchAddressViewState, Continuation<? super SearchAddressViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C122901(Continuation<? super C122901> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C122901 c122901 = new C122901(continuation);
            c122901.L$0 = obj;
            return c122901;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SearchAddressViewState searchAddressViewState, Continuation<? super SearchAddressViewState> continuation) {
            return ((C122901) create(searchAddressViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SearchAddressViewState.copy$default((SearchAddressViewState) this.L$0, false, null, false, 3, null);
        }
    }

    public final void onDismissError() {
        applyMutation(new C122901(null));
    }

    /* compiled from: SearchAddressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onAddressPress$1", m3645f = "SearchAddressDuxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onAddressPress$1 */
    static final class C122881 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $placeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C122881(String str, Continuation<? super C122881> continuation) {
            super(2, continuation);
            this.$placeId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchAddressDuxo.this.new C122881(this.$placeId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C122881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objFetchPlaceDetails$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SearchAddressDuxo.this.applyMutation(new AnonymousClass1(null));
                    PlacesStore placesStore = SearchAddressDuxo.this.placesStore;
                    String str = this.$placeId;
                    AutocompleteSessionToken autocompleteSessionToken = SearchAddressDuxo.this.sessionToken;
                    if (autocompleteSessionToken == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sessionToken");
                        autocompleteSessionToken = null;
                    }
                    this.label = 1;
                    objFetchPlaceDetails$default = PlacesStore.fetchPlaceDetails$default(placesStore, str, autocompleteSessionToken, null, this, 4, null);
                    if (objFetchPlaceDetails$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objFetchPlaceDetails$default = obj;
                }
                FetchPlaceResponse fetchPlaceResponse = (FetchPlaceResponse) objFetchPlaceDetails$default;
                SearchAddressDuxo searchAddressDuxo = SearchAddressDuxo.this;
                Place place = fetchPlaceResponse.getPlace();
                Intrinsics.checkNotNullExpressionValue(place, "getPlace(...)");
                String streetAddress = Places3.getStreetAddress(place);
                String str2 = streetAddress == null ? "" : streetAddress;
                Place place2 = fetchPlaceResponse.getPlace();
                Intrinsics.checkNotNullExpressionValue(place2, "getPlace(...)");
                String city = Places3.getCity(place2);
                String str3 = city == null ? "" : city;
                Place place3 = fetchPlaceResponse.getPlace();
                Intrinsics.checkNotNullExpressionValue(place3, "getPlace(...)");
                String state = Places3.getState(place3);
                String str4 = state == null ? "" : state;
                Place place4 = fetchPlaceResponse.getPlace();
                Intrinsics.checkNotNullExpressionValue(place4, "getPlace(...)");
                String zipcode = Places3.getZipcode(place4);
                searchAddressDuxo.submit(new SearchAddressDuxo3.Verify(new AddressType(str2, "", str3, str4, zipcode == null ? "" : zipcode)));
            } catch (Throwable th) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                SearchAddressDuxo.this.applyMutation(new AnonymousClass2(null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: SearchAddressDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/search/SearchAddressViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onAddressPress$1$1", m3645f = "SearchAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onAddressPress$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SearchAddressViewState, Continuation<? super SearchAddressViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SearchAddressViewState searchAddressViewState, Continuation<? super SearchAddressViewState> continuation) {
                return ((AnonymousClass1) create(searchAddressViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SearchAddressViewState.copy$default((SearchAddressViewState) this.L$0, false, null, false, 3, null);
            }
        }

        /* compiled from: SearchAddressDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/search/SearchAddressViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onAddressPress$1$2", m3645f = "SearchAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onAddressPress$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<SearchAddressViewState, Continuation<? super SearchAddressViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SearchAddressViewState searchAddressViewState, Continuation<? super SearchAddressViewState> continuation) {
                return ((AnonymousClass2) create(searchAddressViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SearchAddressViewState.copy$default((SearchAddressViewState) this.L$0, false, null, true, 3, null);
            }
        }
    }

    public final void onAddressPress(String placeId) {
        Intrinsics.checkNotNullParameter(placeId, "placeId");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new C122881(placeId, null), 2, null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new C122891(null), 2, null);
    }

    /* compiled from: SearchAddressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1", m3645f = "SearchAddressDuxo.kt", m3646l = {116}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1 */
    static final class C122891 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C122891(Continuation<? super C122891> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchAddressDuxo.this.new C122891(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C122891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow2 stateFlow2 = SearchAddressDuxo.this.queryChanges;
                final Flow<CharSequence> flow = new Flow<CharSequence>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C122862<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "SearchAddressDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C122862.this.emit(null, this);
                            }
                        }

                        public C122862(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                CharSequence charSequence = (CharSequence) obj;
                                int length = charSequence.length() - 1;
                                int i3 = 0;
                                boolean z = false;
                                while (i3 <= length) {
                                    boolean z2 = Intrinsics.compare((int) charSequence.charAt(!z ? i3 : length), 32) <= 0;
                                    if (z) {
                                        if (!z2) {
                                            break;
                                        }
                                        length--;
                                    } else if (z2) {
                                        i3++;
                                    } else {
                                        z = true;
                                    }
                                }
                                CharSequence charSequenceSubSequence = charSequence.subSequence(i3, length + 1);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(charSequenceSubSequence, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CharSequence> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow2.collect(new C122862(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                final Flow flowDebounce = FlowKt.debounce(FlowKt.onEach(FlowKt.onEach(new Flow<CharSequence>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$invokeSuspend$$inlined$filter$1$2 */
                    public static final class C122852<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$invokeSuspend$$inlined$filter$1$2", m3645f = "SearchAddressDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C122852.this.emit(null, this);
                            }
                        }

                        public C122852(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (((CharSequence) obj).length() >= 2) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CharSequence> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new C122852(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, new AnonymousClass3(SearchAddressDuxo.this, null)), new AnonymousClass4(null)), 500L);
                final SearchAddressDuxo searchAddressDuxo = SearchAddressDuxo.this;
                Flow flowFilterNotNull = FlowKt.filterNotNull(new Flow<FindAutocompletePredictionsResponse>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$invokeSuspend$$inlined$map$2

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$invokeSuspend$$inlined$map$2$2 */
                    public static final class C122872<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ SearchAddressDuxo this$0;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$invokeSuspend$$inlined$map$2$2", m3645f = "SearchAddressDuxo.kt", m3646l = {52, 50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C122872.this.emit(null, this);
                            }
                        }

                        public C122872(FlowCollector flowCollector, SearchAddressDuxo searchAddressDuxo) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = searchAddressDuxo;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:35:0x00af, code lost:
                        
                            if (r3.emit(r0, r8) != r2) goto L37;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            Throwable th;
                            FlowCollector flowCollector;
                            FindAutocompletePredictionsResponse findAutocompletePredictionsResponse;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            AnonymousClass1 anonymousClass12 = anonymousClass1;
                            Object objAutocomplete$default = anonymousClass12.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass12.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(objAutocomplete$default);
                                FlowCollector flowCollector2 = this.$this_unsafeFlow;
                                CharSequence charSequence = (CharSequence) obj;
                                try {
                                    PlacesStore placesStore = this.this$0.placesStore;
                                    String string2 = charSequence.toString();
                                    AutocompleteSessionToken autocompleteSessionToken = this.this$0.sessionToken;
                                    if (autocompleteSessionToken == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("sessionToken");
                                        autocompleteSessionToken = null;
                                    }
                                    anonymousClass12.L$0 = flowCollector2;
                                    anonymousClass12.label = 1;
                                    objAutocomplete$default = PlacesStore.autocomplete$default(placesStore, string2, autocompleteSessionToken, null, null, anonymousClass12, 12, null);
                                    if (objAutocomplete$default != coroutine_suspended) {
                                        flowCollector = flowCollector2;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    flowCollector = flowCollector2;
                                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                                    IdlingResourceCounters2.setBusy(IdlingResourceType.ONBOARDING_ADDRESS_TYPING, false);
                                    this.this$0.applyMutation(new SearchAddressDuxo2(null));
                                    findAutocompletePredictionsResponse = null;
                                    anonymousClass12.L$0 = null;
                                    anonymousClass12.label = 2;
                                }
                                return coroutine_suspended;
                            }
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(objAutocomplete$default);
                                return Unit.INSTANCE;
                            }
                            flowCollector = (FlowCollector) anonymousClass12.L$0;
                            try {
                                ResultKt.throwOnFailure(objAutocomplete$default);
                            } catch (Throwable th3) {
                                th = th3;
                                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                                IdlingResourceCounters2.setBusy(IdlingResourceType.ONBOARDING_ADDRESS_TYPING, false);
                                this.this$0.applyMutation(new SearchAddressDuxo2(null));
                                findAutocompletePredictionsResponse = null;
                                anonymousClass12.L$0 = null;
                                anonymousClass12.label = 2;
                            }
                            findAutocompletePredictionsResponse = (FindAutocompletePredictionsResponse) objAutocomplete$default;
                            IdlingResourceCounters2.setBusy(IdlingResourceType.ONBOARDING_ADDRESS_TYPING, false);
                            anonymousClass12.L$0 = null;
                            anonymousClass12.label = 2;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super FindAutocompletePredictionsResponse> flowCollector, Continuation continuation) {
                        Object objCollect = flowDebounce.collect(new C122872(flowCollector, searchAddressDuxo), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                AnonymousClass6 anonymousClass6 = new AnonymousClass6(SearchAddressDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass6, this) == coroutine_suspended) {
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

        /* compiled from: SearchAddressDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$3", m3645f = "SearchAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CharSequence, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SearchAddressDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SearchAddressDuxo searchAddressDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = searchAddressDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CharSequence charSequence, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(charSequence, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SearchAddressDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/search/SearchAddressViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$3$1", m3645f = "SearchAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SearchAddressViewState, Continuation<? super SearchAddressViewState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SearchAddressViewState searchAddressViewState, Continuation<? super SearchAddressViewState> continuation) {
                    return ((AnonymousClass1) create(searchAddressViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return SearchAddressViewState.copy$default((SearchAddressViewState) this.L$0, true, null, false, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1(null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: SearchAddressDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$4", m3645f = "SearchAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CharSequence, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CharSequence charSequence, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(charSequence, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                IdlingResourceCounters2.setBusy(IdlingResourceType.ONBOARDING_ADDRESS_TYPING, true);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: SearchAddressDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$6", m3645f = "SearchAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<FindAutocompletePredictionsResponse, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SearchAddressDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(SearchAddressDuxo searchAddressDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = searchAddressDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.this$0, continuation);
                anonymousClass6.L$0 = obj;
                return anonymousClass6;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FindAutocompletePredictionsResponse findAutocompletePredictionsResponse, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(findAutocompletePredictionsResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1(((FindAutocompletePredictionsResponse) this.L$0).getAutocompletePredictions(), null));
                return Unit.INSTANCE;
            }

            /* compiled from: SearchAddressDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/search/SearchAddressViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$6$1", m3645f = "SearchAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SearchAddressViewState, Continuation<? super SearchAddressViewState>, Object> {
                final /* synthetic */ List<AutocompletePrediction> $predictions;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(List<AutocompletePrediction> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$predictions = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$predictions, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SearchAddressViewState searchAddressViewState, Continuation<? super SearchAddressViewState> continuation) {
                    return ((AnonymousClass1) create(searchAddressViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    SearchAddressViewState searchAddressViewState = (SearchAddressViewState) this.L$0;
                    List<AutocompletePrediction> list = this.$predictions;
                    Intrinsics.checkNotNull(list);
                    return searchAddressViewState.copy(false, list, false);
                }
            }
        }
    }
}
