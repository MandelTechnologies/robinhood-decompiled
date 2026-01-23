package com.robinhood.android.address.p062ui;

import android.app.Application;
import android.location.Location;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.jakewharton.rxrelay2.PublishRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.address.lib.p061ui.PlacesAutocompleteOnSubscribe;
import com.robinhood.android.address.p062ui.AddressSelectionDuxo;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressSource;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
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

/* compiled from: AddressSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\b\u0010\u001a\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/address/ui/AddressSelectionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/address/ui/OnboardingAddressSelectionViewState;", "app", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "queryChanges", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "kotlin.jvm.PlatformType", "sessionToken", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "onQueryChanges", "", "input", "setSource", "source", "Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "setSessionToken", "setLocation", "location", "Landroid/location/Location;", "setCountryCode", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "onCreate", "Companion", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AddressSelectionDuxo extends OldBaseDuxo<OnboardingAddressSelectionViewState> {
    private static final long INPUT_DEBOUNCE_MILLISECONDS = 500;
    private static final int QUERY_THRESHOLD = 2;
    private final Application app;
    private final PublishRelay<CharSequence> queryChanges;
    private AutocompleteSessionToken sessionToken;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressSelectionDuxo(Application app) {
        super(new OnboardingAddressSelectionViewState(null, false, false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(app, "app");
        this.app = app;
        PublishRelay<CharSequence> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.queryChanges = publishRelayCreate;
    }

    public final void onQueryChanges(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.queryChanges.accept(input);
    }

    public final void setSource(final ChooseAddressSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        applyMutation(new Function1() { // from class: com.robinhood.android.address.ui.AddressSelectionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSelectionDuxo.setSource$lambda$0(source, (OnboardingAddressSelectionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnboardingAddressSelectionViewState setSource$lambda$0(ChooseAddressSource chooseAddressSource, OnboardingAddressSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OnboardingAddressSelectionViewState.copy$default(applyMutation, null, false, false, null, null, null, chooseAddressSource, 63, null);
    }

    public final void setSessionToken(AutocompleteSessionToken sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        this.sessionToken = sessionToken;
    }

    public final void setLocation(final Location location) {
        applyMutation(new Function1() { // from class: com.robinhood.android.address.ui.AddressSelectionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSelectionDuxo.setLocation$lambda$1(location, (OnboardingAddressSelectionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnboardingAddressSelectionViewState setLocation$lambda$1(Location location, OnboardingAddressSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OnboardingAddressSelectionViewState.copy$default(applyMutation, null, false, false, location, null, null, null, 119, null);
    }

    public final void setCountryCode(final CountryCode.Supported countryCode) {
        applyMutation(new Function1() { // from class: com.robinhood.android.address.ui.AddressSelectionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSelectionDuxo.setCountryCode$lambda$2(countryCode, (OnboardingAddressSelectionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnboardingAddressSelectionViewState setCountryCode$lambda$2(CountryCode.Supported supported, OnboardingAddressSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OnboardingAddressSelectionViewState.copy$default(applyMutation, null, false, false, null, null, supported, null, 95, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Observable observableDebounce = this.queryChanges.skip(1L).doOnNext(new C83441()).map(new Function() { // from class: com.robinhood.android.address.ui.AddressSelectionDuxo.onCreate.2
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
        }).filter(new Predicate() { // from class: com.robinhood.android.address.ui.AddressSelectionDuxo.onCreate.3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(CharSequence query) {
                Intrinsics.checkNotNullParameter(query, "query");
                return query.length() >= 2;
            }
        }).doOnNext(new C83474()).doOnNext(new Consumer() { // from class: com.robinhood.android.address.ui.AddressSelectionDuxo.onCreate.5
            @Override // io.reactivex.functions.Consumer
            public final void accept(CharSequence charSequence) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.ONBOARDING_ADDRESS_TYPING, true);
            }
        }).debounce(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableDebounce, "debounce(...)");
        Observable observableOnErrorResumeNext = ObservablesKt.withLatestFrom(observableDebounce, getStates()).switchMapSingle(new Function() { // from class: com.robinhood.android.address.ui.AddressSelectionDuxo.onCreate.6
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends FindAutocompletePredictionsResponse> apply(Tuples2<? extends CharSequence, OnboardingAddressSelectionViewState> tuples2) {
                AutocompleteSessionToken autocompleteSessionToken;
                String iso3166CountryCode;
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                CharSequence charSequenceComponent1 = tuples2.component1();
                OnboardingAddressSelectionViewState onboardingAddressSelectionViewStateComponent2 = tuples2.component2();
                Application application = AddressSelectionDuxo.this.app;
                String string2 = charSequenceComponent1.toString();
                AutocompleteSessionToken autocompleteSessionToken2 = AddressSelectionDuxo.this.sessionToken;
                List listListOf = null;
                if (autocompleteSessionToken2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sessionToken");
                    autocompleteSessionToken = null;
                } else {
                    autocompleteSessionToken = autocompleteSessionToken2;
                }
                Location location = onboardingAddressSelectionViewStateComponent2.getLocation();
                CountryCode.Supported countryCode = onboardingAddressSelectionViewStateComponent2.getCountryCode();
                if (countryCode != null && (iso3166CountryCode = countryCode.getIso3166CountryCode()) != null) {
                    listListOf = CollectionsKt.listOf(iso3166CountryCode);
                }
                return Single.create(new PlacesAutocompleteOnSubscribe(application, string2, autocompleteSessionToken, location, listListOf)).subscribeOn(Schedulers.m3346io());
            }
        }).doOnNext(new Consumer() { // from class: com.robinhood.android.address.ui.AddressSelectionDuxo.onCreate.7
            @Override // io.reactivex.functions.Consumer
            public final void accept(FindAutocompletePredictionsResponse findAutocompletePredictionsResponse) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.ONBOARDING_ADDRESS_TYPING, false);
            }
        }).doOnError(new Consumer() { // from class: com.robinhood.android.address.ui.AddressSelectionDuxo.onCreate.8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.ONBOARDING_ADDRESS_TYPING, false);
            }
        }).onErrorResumeNext(new C83529());
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableOnErrorResumeNext, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.address.ui.AddressSelectionDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSelectionDuxo.onCreate$lambda$4(this.f$0, (FindAutocompletePredictionsResponse) obj);
            }
        });
    }

    /* compiled from: AddressSelectionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.address.ui.AddressSelectionDuxo$onCreate$1 */
    static final class C83441<T> implements Consumer {
        C83441() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(CharSequence charSequence) {
            AddressSelectionDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.address.ui.AddressSelectionDuxo$onCreate$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AddressSelectionDuxo.C83441.accept$lambda$0((OnboardingAddressSelectionViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OnboardingAddressSelectionViewState accept$lambda$0(OnboardingAddressSelectionViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return OnboardingAddressSelectionViewState.copy$default(applyMutation, null, false, false, null, null, null, null, 123, null);
        }
    }

    /* compiled from: AddressSelectionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.address.ui.AddressSelectionDuxo$onCreate$4 */
    static final class C83474<T> implements Consumer {
        C83474() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(CharSequence charSequence) {
            AddressSelectionDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.address.ui.AddressSelectionDuxo$onCreate$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AddressSelectionDuxo.C83474.accept$lambda$0((OnboardingAddressSelectionViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OnboardingAddressSelectionViewState accept$lambda$0(OnboardingAddressSelectionViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return OnboardingAddressSelectionViewState.copy$default(applyMutation, null, true, false, null, null, null, null, 125, null);
        }
    }

    /* compiled from: AddressSelectionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.address.ui.AddressSelectionDuxo$onCreate$9 */
    static final class C83529<T, R> implements Function {
        C83529() {
        }

        @Override // io.reactivex.functions.Function
        public final ObservableSource<? extends FindAutocompletePredictionsResponse> apply(final Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            AddressSelectionDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.address.ui.AddressSelectionDuxo$onCreate$9$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AddressSelectionDuxo.C83529.apply$lambda$0(t, (OnboardingAddressSelectionViewState) obj);
                }
            });
            return Observable.just(FindAutocompletePredictionsResponse.newInstance(CollectionsKt.emptyList()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OnboardingAddressSelectionViewState apply$lambda$0(Throwable th, OnboardingAddressSelectionViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return OnboardingAddressSelectionViewState.copy$default(applyMutation, null, false, false, null, new UiEvent(th), null, null, 111, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(AddressSelectionDuxo addressSelectionDuxo, FindAutocompletePredictionsResponse findAutocompletePredictionsResponse) {
        final List<AutocompletePrediction> autocompletePredictions = findAutocompletePredictionsResponse.getAutocompletePredictions();
        addressSelectionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.address.ui.AddressSelectionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSelectionDuxo.onCreate$lambda$4$lambda$3(autocompletePredictions, (OnboardingAddressSelectionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnboardingAddressSelectionViewState onCreate$lambda$4$lambda$3(List list, OnboardingAddressSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return OnboardingAddressSelectionViewState.copy$default(applyMutation, list, false, false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
    }
}
