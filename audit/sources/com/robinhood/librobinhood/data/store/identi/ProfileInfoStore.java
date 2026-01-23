package com.robinhood.librobinhood.data.store.identi;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.identi.ApiProfileInfo;
import com.robinhood.models.api.identi.MaritalStatus;
import com.robinhood.models.p355ui.identi.UiProfileInfo;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.UUID;
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
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.LocalDate;

/* compiled from: ProfileInfoStore.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u00011B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J[\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001d2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\"\u0010#\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010\u000e0\u000e0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R%\u0010'\u001a\u0013\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b&\u0012\u0004\u0012\u00020\n0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000e0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/api/retrofit/Identi;", "identi", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/api/retrofit/Identi;Lcom/robinhood/store/StoreBundle;)V", "", "force", "", "refreshProfileInfo", "(Z)V", "Lio/reactivex/Observable;", "Lcom/robinhood/models/ui/identi/UiProfileInfo;", "streamProfileInfo", "()Lio/reactivex/Observable;", "j$/time/LocalDate", "dateOfBirth", "Lcom/robinhood/iso/countrycode/CountryCode;", "citizenship", "Lcom/robinhood/models/api/identi/MaritalStatus;", "maritalStatus", "", "numDependents", "", "phoneNumber", "Ljava/util/UUID;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Lio/reactivex/Single;", "updateProfileInfo", "(Lj$/time/LocalDate;Lcom/robinhood/iso/countrycode/CountryCode;Lcom/robinhood/models/api/identi/MaritalStatus;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/UUID;)Lio/reactivex/Single;", "Lcom/robinhood/api/retrofit/Identi;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "kotlin.jvm.PlatformType", "profileInfoCache", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lkotlin/reflect/KFunction1;", "Lkotlin/jvm/internal/EnhancedNullability;", "profileInfoSaveAction", "Lkotlin/reflect/KFunction;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/identi/ApiProfileInfo;", "profileInfoEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore$UpdateProfileInfoParams;", "updateProfileInfoEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "UpdateProfileInfoParams", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class ProfileInfoStore extends Store {
    private final Identi identi;
    private final BehaviorRelay<UiProfileInfo> profileInfoCache;
    private final Endpoint<Unit, ApiProfileInfo> profileInfoEndpoint;
    private final KFunction<Unit> profileInfoSaveAction;
    private final PostEndpoint<UpdateProfileInfoParams, UiProfileInfo> updateProfileInfoEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileInfoStore(Identi identi2, StoreBundle storeBundle) {
        super(storeBundle, UiProfileInfo.INSTANCE);
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.identi = identi2;
        BehaviorRelay<UiProfileInfo> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.profileInfoCache = behaviorRelayCreate;
        ProfileInfoStore4 profileInfoStore4 = new ProfileInfoStore4(behaviorRelayCreate);
        this.profileInfoSaveAction = profileInfoStore4;
        this.profileInfoEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new ProfileInfoStore2(this, null), getLogoutKillswitch(), new ProfileInfoStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.updateProfileInfoEndpoint = PostEndpoint.INSTANCE.create(new ProfileInfoStore5(this, null), new ProfileInfoStore6(profileInfoStore4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object updateProfileInfoEndpoint$invoke(KFunction kFunction, UiProfileInfo uiProfileInfo, Continuation continuation) {
        ((Function1) kFunction).invoke(uiProfileInfo);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void refreshProfileInfo$default(ProfileInfoStore profileInfoStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        profileInfoStore.refreshProfileInfo(z);
    }

    public final void refreshProfileInfo(boolean force) {
        Endpoint8.refresh$default(this.profileInfoEndpoint, force, null, 2, null);
    }

    public final Observable<UiProfileInfo> streamProfileInfo() {
        Observable<UiProfileInfo> observableHide = this.profileInfoCache.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    public static /* synthetic */ Single updateProfileInfo$default(ProfileInfoStore profileInfoStore, LocalDate localDate, CountryCode countryCode, MaritalStatus maritalStatus, Integer num, String str, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            localDate = null;
        }
        if ((i & 2) != 0) {
            countryCode = null;
        }
        if ((i & 4) != 0) {
            maritalStatus = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            uuid = null;
        }
        return profileInfoStore.updateProfileInfo(localDate, countryCode, maritalStatus, num, str, uuid);
    }

    /* compiled from: ProfileInfoStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/identi/UiProfileInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.ProfileInfoStore$updateProfileInfo$1", m3645f = "ProfileInfoStore.kt", m3646l = {64}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.ProfileInfoStore$updateProfileInfo$1 */
    static final class C348381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiProfileInfo>, Object> {
        final /* synthetic */ UUID $challengeId;
        final /* synthetic */ CountryCode $citizenship;
        final /* synthetic */ LocalDate $dateOfBirth;
        final /* synthetic */ MaritalStatus $maritalStatus;
        final /* synthetic */ Integer $numDependents;
        final /* synthetic */ String $phoneNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348381(LocalDate localDate, CountryCode countryCode, MaritalStatus maritalStatus, Integer num, String str, UUID uuid, Continuation<? super C348381> continuation) {
            super(2, continuation);
            this.$dateOfBirth = localDate;
            this.$citizenship = countryCode;
            this.$maritalStatus = maritalStatus;
            this.$numDependents = num;
            this.$phoneNumber = str;
            this.$challengeId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProfileInfoStore.this.new C348381(this.$dateOfBirth, this.$citizenship, this.$maritalStatus, this.$numDependents, this.$phoneNumber, this.$challengeId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiProfileInfo> continuation) {
            return ((C348381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            PostEndpoint postEndpoint = ProfileInfoStore.this.updateProfileInfoEndpoint;
            UpdateProfileInfoParams updateProfileInfoParams = new UpdateProfileInfoParams(this.$challengeId, new ApiProfileInfo.Request(this.$dateOfBirth, this.$citizenship, this.$maritalStatus, this.$numDependents, this.$phoneNumber));
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, updateProfileInfoParams, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<UiProfileInfo> updateProfileInfo(LocalDate dateOfBirth, CountryCode citizenship, MaritalStatus maritalStatus, Integer numDependents, String phoneNumber, UUID challengeId) {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C348381(dateOfBirth, citizenship, maritalStatus, numDependents, phoneNumber, challengeId, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProfileInfoStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore$UpdateProfileInfoParams;", "", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "request", "Lcom/robinhood/models/api/identi/ApiProfileInfo$Request;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/identi/ApiProfileInfo$Request;)V", "getChallengeId", "()Ljava/util/UUID;", "getRequest", "()Lcom/robinhood/models/api/identi/ApiProfileInfo$Request;", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class UpdateProfileInfoParams {
        private final UUID challengeId;
        private final ApiProfileInfo.Request request;

        public UpdateProfileInfoParams(UUID uuid, ApiProfileInfo.Request request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.challengeId = uuid;
            this.request = request;
        }

        public final UUID getChallengeId() {
            return this.challengeId;
        }

        public final ApiProfileInfo.Request getRequest() {
            return this.request;
        }
    }
}
