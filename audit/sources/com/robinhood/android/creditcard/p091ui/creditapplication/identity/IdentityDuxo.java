package com.robinhood.android.creditcard.p091ui.creditapplication.identity;

import android.app.Application;
import android.location.Address;
import android.location.Geocoder;
import android.location.Geocoder$GeocodeListener;
import android.os.Build;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.creditcard.p091ui.creditapplication.identity.IdentityDuxo4;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.CreateCreditApplicationRequest;
import com.robinhood.android.models.creditcard.api.graphql.IdentityDetailsPrefillResponse2;
import com.robinhood.android.models.creditcard.api.graphql.ServiceLevelType;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.ErrorBundle;
import timber.log.Timber;

/* compiled from: IdentityDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0010J\u0016\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eJ\u0016\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0002J\u0015\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0000¢\u0006\u0002\b R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityViewState;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent;", "app", "Landroid/app/Application;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroid/app/Application;Lcom/robinhood/android/udf/DuxoBundle;)V", "onNext", "", "event", "invalidPhone", "", "e164", "", "updateInfo", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/PersonalInfo;", "updateSsn", "ssn", "updateAddress", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "isReplacement", "onComplete", "income", "state", "setDetails", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/android/models/creditcard/api/graphql/IdentityDetailsPrefillObject;", "setDetails$feature_credit_card_externalDebug", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class IdentityDuxo extends BaseDuxo5<IdentityViewState, IdentityDuxo4> {
    public static final int $stable = 8;
    private final Application app;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityDuxo(Application app, DuxoBundle duxoBundle) {
        super(new IdentityViewState(null, null, null, null, null, null, 63, null), duxoBundle);
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.app = app;
    }

    public final void onNext(IdentityDuxo4 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        submit(event);
    }

    public final boolean invalidPhone(String e164) {
        Intrinsics.checkNotNullParameter(e164, "e164");
        return IdentityDuxo3.strippedPhone(e164).length() == 0;
    }

    /* compiled from: IdentityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityDuxo$updateInfo$1", m3645f = "IdentityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityDuxo$updateInfo$1 */
    static final class C123971 extends ContinuationImpl7 implements Function2<IdentityViewState, Continuation<? super IdentityViewState>, Object> {
        final /* synthetic */ PersonalInfo $info;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C123971(PersonalInfo personalInfo, Continuation<? super C123971> continuation) {
            super(2, continuation);
            this.$info = personalInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C123971 c123971 = new C123971(this.$info, continuation);
            c123971.L$0 = obj;
            return c123971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IdentityViewState identityViewState, Continuation<? super IdentityViewState> continuation) {
            return ((C123971) create(identityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IdentityViewState.copy$default((IdentityViewState) this.L$0, this.$info, null, null, null, null, null, 62, null);
        }
    }

    public final void updateInfo(PersonalInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        applyMutation(new C123971(info, null));
    }

    /* compiled from: IdentityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityDuxo$updateSsn$1", m3645f = "IdentityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityDuxo$updateSsn$1 */
    static final class C123981 extends ContinuationImpl7 implements Function2<IdentityViewState, Continuation<? super IdentityViewState>, Object> {
        final /* synthetic */ String $ssn;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C123981(String str, Continuation<? super C123981> continuation) {
            super(2, continuation);
            this.$ssn = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C123981 c123981 = new C123981(this.$ssn, continuation);
            c123981.L$0 = obj;
            return c123981;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IdentityViewState identityViewState, Continuation<? super IdentityViewState> continuation) {
            return ((C123981) create(identityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IdentityViewState.copy$default((IdentityViewState) this.L$0, null, this.$ssn, null, null, null, null, 61, null);
        }
    }

    public final void updateSsn(String ssn) {
        Intrinsics.checkNotNullParameter(ssn, "ssn");
        applyMutation(new C123981(ssn, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Double] */
    /* JADX WARN: Type inference failed for: r12v8, types: [T, java.lang.Double] */
    public final void updateAddress(final AddressType address, final boolean isReplacement) throws IOException {
        Intrinsics.checkNotNullParameter(address, "address");
        String str = address.getPrimaryAddressLine() + PlaceholderUtils.XXShortPlaceholderText + address.getSecondaryAddressLine() + PlaceholderUtils.XXShortPlaceholderText + address.getLocality() + PlaceholderUtils.XXShortPlaceholderText + address.getSubdivision() + PlaceholderUtils.XXShortPlaceholderText + address.getZip();
        Geocoder geocoder = new Geocoder(this.app);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        if (Build.VERSION.SDK_INT >= 33) {
            geocoder.getFromLocationName(str, 1, IdentityDuxo$$ExternalSyntheticApiModelOutline0.m1878m(new Geocoder$GeocodeListener() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityDuxo.updateAddress.1
                /* JADX WARN: Type inference failed for: r2v7, types: [T, java.lang.Double] */
                /* JADX WARN: Type inference failed for: r6v6, types: [T, java.lang.Double] */
                public final void onGeocode(List<Address> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (!it.isEmpty()) {
                        objectRef.element = Double.valueOf(it.get(0).getLatitude());
                        objectRef2.element = Double.valueOf(it.get(0).getLongitude());
                    }
                    this.applyMutation(new AnonymousClass1(address, objectRef, objectRef2, null));
                    if (isReplacement) {
                        this.submit(new IdentityDuxo4.UpdatedAddress(address, objectRef.element, objectRef2.element));
                    }
                }

                /* compiled from: IdentityDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityDuxo$updateAddress$1$1", m3645f = "IdentityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityDuxo$updateAddress$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<IdentityViewState, Continuation<? super IdentityViewState>, Object> {
                    final /* synthetic */ AddressType $address;
                    final /* synthetic */ Ref.ObjectRef<Double> $lang;
                    final /* synthetic */ Ref.ObjectRef<Double> $lat;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(AddressType addressType, Ref.ObjectRef<Double> objectRef, Ref.ObjectRef<Double> objectRef2, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$address = addressType;
                        this.$lat = objectRef;
                        this.$lang = objectRef2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$address, this.$lat, this.$lang, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(IdentityViewState identityViewState, Continuation<? super IdentityViewState> continuation) {
                        return ((AnonymousClass1) create(identityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return IdentityViewState.copy$default((IdentityViewState) this.L$0, null, null, this.$address, this.$lat.element, this.$lang.element, null, 35, null);
                    }
                }
            }));
            return;
        }
        try {
            List<Address> fromLocationName = geocoder.getFromLocationName(str, 1);
            List<Address> list = fromLocationName;
            if (list != null && !list.isEmpty()) {
                objectRef.element = Double.valueOf(fromLocationName.get(0).getLatitude());
                objectRef2.element = Double.valueOf(fromLocationName.get(0).getLongitude());
            }
        } catch (Exception e) {
            Timber.INSTANCE.mo3355e(e, "geocoder.getFromLocationName fetch error", new Object[0]);
        }
        applyMutation(new C123962(address, objectRef, objectRef2, null));
        if (isReplacement) {
            submit(new IdentityDuxo4.UpdatedAddress(address, (Double) objectRef.element, (Double) objectRef2.element));
        }
    }

    /* compiled from: IdentityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityDuxo$updateAddress$2", m3645f = "IdentityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityDuxo$updateAddress$2 */
    static final class C123962 extends ContinuationImpl7 implements Function2<IdentityViewState, Continuation<? super IdentityViewState>, Object> {
        final /* synthetic */ AddressType $address;
        final /* synthetic */ Ref.ObjectRef<Double> $lang;
        final /* synthetic */ Ref.ObjectRef<Double> $lat;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C123962(AddressType addressType, Ref.ObjectRef<Double> objectRef, Ref.ObjectRef<Double> objectRef2, Continuation<? super C123962> continuation) {
            super(2, continuation);
            this.$address = addressType;
            this.$lat = objectRef;
            this.$lang = objectRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C123962 c123962 = new C123962(this.$address, this.$lat, this.$lang, continuation);
            c123962.L$0 = obj;
            return c123962;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IdentityViewState identityViewState, Continuation<? super IdentityViewState> continuation) {
            return ((C123962) create(identityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IdentityViewState.copy$default((IdentityViewState) this.L$0, null, null, this.$address, this.$lat.element, this.$lang.element, null, 35, null);
        }
    }

    public final PersonalInfo setDetails$feature_credit_card_externalDebug(IdentityDetailsPrefillResponse2 details) throws IOException {
        Intrinsics.checkNotNullParameter(details, "details");
        PersonalInfo personalInfo = new PersonalInfo(details.getFirstName(), details.getLastName(), details.getEmail(), IdentityDuxo3.strippedPhone(details.getE164()), details.getDateOfBirth(), details.getSsnLast4());
        applyMutation(new IdentityDuxo2(personalInfo, details, null));
        updateAddress(details.getResidentialAddress(), false);
        return personalInfo;
    }

    public final void onComplete(String income, IdentityViewState state) throws IOException {
        Intrinsics.checkNotNullParameter(income, "income");
        Intrinsics.checkNotNullParameter(state, "state");
        StringBuilder sb = new StringBuilder();
        int length = income.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = income.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        long j = Long.parseLong(sb.toString()) * InvestFlowConstants.MAX_ONE_TIME_AMOUNT;
        IdentityViewState identityViewStateCopy$default = IdentityViewState.copy$default(state, null, null, null, null, null, Long.valueOf(j), 31, null);
        String firstName = identityViewStateCopy$default.getInfo().getFirstName();
        String lastName = identityViewStateCopy$default.getInfo().getLastName();
        String str = "+1" + IdentityDuxo3.strippedPhone(identityViewStateCopy$default.getInfo().getE164());
        String email = identityViewStateCopy$default.getInfo().getEmail();
        String dateOfBirth = identityViewStateCopy$default.getInfo().getDateOfBirth();
        String ssn = identityViewStateCopy$default.getSsn();
        if (ssn.length() == 0) {
            ssn = identityViewStateCopy$default.getInfo().getSsnLast4();
        }
        submit(new IdentityDuxo4.Complete(new CreateCreditApplicationRequest(firstName, lastName, email, str, dateOfBirth, ssn, new CreateCreditApplicationRequest.Address(identityViewStateCopy$default.getAddress().getPrimaryAddressLine(), identityViewStateCopy$default.getAddress().getSecondaryAddressLine(), identityViewStateCopy$default.getAddress().getLocality(), identityViewStateCopy$default.getAddress().getSubdivision(), identityViewStateCopy$default.getAddress().getZip()), j, ServiceLevelType.RH_GOLD, false, false)));
    }
}
