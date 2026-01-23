package com.robinhood.android.odyssey.lib.template.address;

import android.app.Application;
import android.location.Location;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.address.lib.p061ui.PlacesAutocompleteOnSubscribe;
import com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadDuxo;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.ObservablesKt;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdAddressTypeAheadDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\b\u0010\u001c\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/address/SdAddressTypeAheadDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/odyssey/lib/template/address/SdAddressTypeAheadViewState;", "app", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "value", "", "", "supportedCountryCodes", "getSupportedCountryCodes", "()Ljava/util/List;", "setSupportedCountryCodes", "(Ljava/util/List;)V", "queryChanges", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "kotlin.jvm.PlatformType", "sessionToken", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "onQueryChanges", "", "input", "setSessionToken", "setLocation", "location", "Landroid/location/Location;", "onCreate", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class SdAddressTypeAheadDuxo extends OldBaseDuxo<SdAddressTypeAheadViewState> {
    private static final long INPUT_DEBOUNCE_MILLISECONDS = 500;
    private static final int MAX_SUPPORTED_COUNTRIES = 5;
    private static final int QUERY_THRESHOLD = 2;
    private final Application app;
    private final PublishRelay<CharSequence> queryChanges;
    private AutocompleteSessionToken sessionToken;
    private List<String> supportedCountryCodes;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SdAddressTypeAheadDuxo(Application app) {
        super(new SdAddressTypeAheadViewState(null, false, false, null, 15, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(app, "app");
        this.app = app;
        PublishRelay<CharSequence> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.queryChanges = publishRelayCreate;
    }

    public final List<String> getSupportedCountryCodes() {
        return this.supportedCountryCodes;
    }

    public final void setSupportedCountryCodes(List<String> list) {
        if (list != null && list.size() > 5) {
            list = list.subList(0, 5);
        }
        this.supportedCountryCodes = list;
    }

    public final void onQueryChanges(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.queryChanges.accept(input);
    }

    public final void setSessionToken(AutocompleteSessionToken sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        this.sessionToken = sessionToken;
    }

    public final void setLocation(final Location location) {
        applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdAddressTypeAheadDuxo.setLocation$lambda$0(location, (SdAddressTypeAheadViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SdAddressTypeAheadViewState setLocation$lambda$0(Location location, SdAddressTypeAheadViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SdAddressTypeAheadViewState.copy$default(applyMutation, null, false, false, location, 7, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Observable observableDebounce = this.queryChanges.skip(1L).doOnNext(new C226741()).map(new Function() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadDuxo.onCreate.2
            @Override // io.reactivex.functions.Function
            public final CharSequence apply(CharSequence query) {
                Intrinsics.checkNotNullParameter(query, "query");
                int length = query.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.compare((int) query.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                return query.subSequence(i, length + 1);
            }
        }).filter(new Predicate() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadDuxo.onCreate.3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(CharSequence query) {
                Intrinsics.checkNotNullParameter(query, "query");
                return query.length() >= 2;
            }
        }).doOnNext(new C226774()).doOnNext(new Consumer() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadDuxo.onCreate.5
            @Override // io.reactivex.functions.Consumer
            public final void accept(CharSequence charSequence) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.ONBOARDING_ADDRESS_TYPING, true);
            }
        }).debounce(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableDebounce, "debounce(...)");
        Observable observableOnErrorResumeNext = ObservablesKt.withLatestFrom(observableDebounce, getStates()).switchMapSingle(new Function() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadDuxo.onCreate.6
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends FindAutocompletePredictionsResponse> apply(Tuples2<? extends CharSequence, SdAddressTypeAheadViewState> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                CharSequence charSequenceComponent1 = tuples2.component1();
                SdAddressTypeAheadViewState sdAddressTypeAheadViewStateComponent2 = tuples2.component2();
                Application application = SdAddressTypeAheadDuxo.this.app;
                String string2 = charSequenceComponent1.toString();
                AutocompleteSessionToken autocompleteSessionToken = SdAddressTypeAheadDuxo.this.sessionToken;
                if (autocompleteSessionToken == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sessionToken");
                    autocompleteSessionToken = null;
                }
                return Single.create(new PlacesAutocompleteOnSubscribe(application, string2, autocompleteSessionToken, sdAddressTypeAheadViewStateComponent2.getLocation(), SdAddressTypeAheadDuxo.this.getSupportedCountryCodes())).subscribeOn(Schedulers.m3346io());
            }
        }).doOnNext(new Consumer() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadDuxo.onCreate.7
            @Override // io.reactivex.functions.Consumer
            public final void accept(FindAutocompletePredictionsResponse findAutocompletePredictionsResponse) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.ONBOARDING_ADDRESS_TYPING, false);
            }
        }).doOnError(new Consumer() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadDuxo.onCreate.8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.ONBOARDING_ADDRESS_TYPING, false);
            }
        }).onErrorResumeNext(new Function() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadDuxo.onCreate.9
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends FindAutocompletePredictionsResponse> apply(Throwable th) {
                Intrinsics.checkNotNullParameter(th, "<unused var>");
                return Observable.just(FindAutocompletePredictionsResponse.newInstance(CollectionsKt.emptyList()));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableOnErrorResumeNext, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdAddressTypeAheadDuxo.onCreate$lambda$2(this.f$0, (FindAutocompletePredictionsResponse) obj);
            }
        });
    }

    /* compiled from: SdAddressTypeAheadDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadDuxo$onCreate$1 */
    static final class C226741<T> implements Consumer {
        C226741() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(CharSequence charSequence) {
            SdAddressTypeAheadDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadDuxo$onCreate$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SdAddressTypeAheadDuxo.C226741.accept$lambda$0((SdAddressTypeAheadViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SdAddressTypeAheadViewState accept$lambda$0(SdAddressTypeAheadViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return SdAddressTypeAheadViewState.copy$default(applyMutation, null, false, false, null, 11, null);
        }
    }

    /* compiled from: SdAddressTypeAheadDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadDuxo$onCreate$4 */
    static final class C226774<T> implements Consumer {
        C226774() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(CharSequence charSequence) {
            SdAddressTypeAheadDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadDuxo$onCreate$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SdAddressTypeAheadDuxo.C226774.accept$lambda$0((SdAddressTypeAheadViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SdAddressTypeAheadViewState accept$lambda$0(SdAddressTypeAheadViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return SdAddressTypeAheadViewState.copy$default(applyMutation, null, true, false, null, 13, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(SdAddressTypeAheadDuxo sdAddressTypeAheadDuxo, FindAutocompletePredictionsResponse findAutocompletePredictionsResponse) {
        final List<AutocompletePrediction> autocompletePredictions = findAutocompletePredictionsResponse.getAutocompletePredictions();
        sdAddressTypeAheadDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdAddressTypeAheadDuxo.onCreate$lambda$2$lambda$1(autocompletePredictions, (SdAddressTypeAheadViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SdAddressTypeAheadViewState onCreate$lambda$2$lambda$1(List list, SdAddressTypeAheadViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return SdAddressTypeAheadViewState.copy$default(applyMutation, list, false, false, null, 12, null);
    }
}
