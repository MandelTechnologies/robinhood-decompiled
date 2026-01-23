package com.robinhood.librobinhood.data.store.bonfire.beneficiaries;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiariesService;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfo;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryRole;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiarySignedAgreement;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryType;
import bonfire.proto.idl.beneficiaries.p031v1.CreateBeneficiaryRequest;
import bonfire.proto.idl.beneficiaries.p031v1.CreateBeneficiaryResponse;
import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowIntroViewModelsRequest;
import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowIntroViewModelsResponse;
import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowRequest;
import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowResponse;
import bonfire.proto.idl.beneficiaries.p031v1.IndividualBeneficiaryInfo;
import bonfire.proto.idl.beneficiaries.p031v1.TrustBeneficiaryInfo;
import bonfire.proto.idl.beneficiaries.p031v1.UpdateBeneficiaryRequest;
import bonfire.proto.idl.beneficiaries.p031v1.UpdateBeneficiaryResponse;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.mapper.BeneficiaryCreateFlowRequestMapper;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.mapper.BeneficiaryCreateRequestMapper;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.mapper.BeneficiaryIntroFlowRequestMapper;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.mapper.BeneficiaryUpdateRequestMapper;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.ByteString;
import p479j$.time.LocalDate;

/* compiled from: BeneficiaryStore.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ`\u0010'\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100#2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0086@¢\u0006\u0004\b'\u0010(J\\\u0010*\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100#H\u0086@¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R \u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0012018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u001b018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R \u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020&078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020)078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010:¨\u0006="}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryStore;", "Lcom/robinhood/store/Store;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiariesService;", "beneficiariesService", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryIntroFlowRequestMapper;", "beneficiaryIntroFlowRequestMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryCreateFlowRequestMapper;", "beneficiaryCreateFlowRequestMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryCreateRequestMapper;", "beneficiaryCreateBeneficiaryRequestMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryUpdateRequestMapper;", "beneficiaryUpdateRequestMapper", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiariesService;Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryIntroFlowRequestMapper;Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryCreateFlowRequestMapper;Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryCreateRequestMapper;Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryUpdateRequestMapper;Lcom/robinhood/store/StoreBundle;)V", "", "accountNumber", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponse;", "fetchIntroFlowViewModels", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/UUID;", "beneficiaryId", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryType;", "beneficiaryType", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;", "beneficiaryRole", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowResponse;", "fetchCreateFlowViewModels", "(Ljava/lang/String;Ljava/util/UUID;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryType;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "name", "j$/time/LocalDate", InquiryField.DateField.TYPE, "taxIdentifier", "email", "", "signedAgreementsTypes", "additionalAccountsNumbers", "Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryResponse;", "createTrustBeneficiary", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/beneficiaries/v1/UpdateBeneficiaryResponse;", "updateTrustBeneficiary", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lj$/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiariesService;", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryIntroFlowRequestMapper;", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryCreateFlowRequestMapper;", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryCreateRequestMapper;", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryUpdateRequestMapper;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsRequest;", "beneficiaryIntroFlowEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowRequest;", "beneficiaryCreateFlowEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequest;", "createBeneficiaryEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lbonfire/proto/idl/beneficiaries/v1/UpdateBeneficiaryRequest;", "updateBeneficiaryEndpoint", "lib-store-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class BeneficiaryStore extends Store {
    private final BeneficiariesService beneficiariesService;
    private final BeneficiaryCreateRequestMapper beneficiaryCreateBeneficiaryRequestMapper;
    private final Endpoint<GetBeneficiaryFlowRequest, GetBeneficiaryFlowResponse> beneficiaryCreateFlowEndpoint;
    private final BeneficiaryCreateFlowRequestMapper beneficiaryCreateFlowRequestMapper;
    private final Endpoint<GetBeneficiaryFlowIntroViewModelsRequest, GetBeneficiaryFlowIntroViewModelsResponse> beneficiaryIntroFlowEndpoint;
    private final BeneficiaryIntroFlowRequestMapper beneficiaryIntroFlowRequestMapper;
    private final BeneficiaryUpdateRequestMapper beneficiaryUpdateRequestMapper;
    private final PostEndpoint<CreateBeneficiaryRequest, CreateBeneficiaryResponse> createBeneficiaryEndpoint;
    private final PostEndpoint<UpdateBeneficiaryRequest, UpdateBeneficiaryResponse> updateBeneficiaryEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryStore(BeneficiariesService beneficiariesService, BeneficiaryIntroFlowRequestMapper beneficiaryIntroFlowRequestMapper, BeneficiaryCreateFlowRequestMapper beneficiaryCreateFlowRequestMapper, BeneficiaryCreateRequestMapper beneficiaryCreateBeneficiaryRequestMapper, BeneficiaryUpdateRequestMapper beneficiaryUpdateRequestMapper, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(beneficiariesService, "beneficiariesService");
        Intrinsics.checkNotNullParameter(beneficiaryIntroFlowRequestMapper, "beneficiaryIntroFlowRequestMapper");
        Intrinsics.checkNotNullParameter(beneficiaryCreateFlowRequestMapper, "beneficiaryCreateFlowRequestMapper");
        Intrinsics.checkNotNullParameter(beneficiaryCreateBeneficiaryRequestMapper, "beneficiaryCreateBeneficiaryRequestMapper");
        Intrinsics.checkNotNullParameter(beneficiaryUpdateRequestMapper, "beneficiaryUpdateRequestMapper");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.beneficiariesService = beneficiariesService;
        this.beneficiaryIntroFlowRequestMapper = beneficiaryIntroFlowRequestMapper;
        this.beneficiaryCreateFlowRequestMapper = beneficiaryCreateFlowRequestMapper;
        this.beneficiaryCreateBeneficiaryRequestMapper = beneficiaryCreateBeneficiaryRequestMapper;
        this.beneficiaryUpdateRequestMapper = beneficiaryUpdateRequestMapper;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.beneficiaryIntroFlowEndpoint = Endpoint.Companion.create$default(companion, new BeneficiaryStore4(this, null), getLogoutKillswitch(), new BeneficiaryStore5(null), storeBundle.getClock(), null, 16, null);
        this.beneficiaryCreateFlowEndpoint = Endpoint.Companion.create$default(companion, new BeneficiaryStore2(this, null), getLogoutKillswitch(), new BeneficiaryStore3(null), storeBundle.getClock(), null, 16, null);
        PostEndpoint.Companion companion2 = PostEndpoint.INSTANCE;
        this.createBeneficiaryEndpoint = companion2.create(new BeneficiaryStore6(this, null), new BeneficiaryStore7(null));
        this.updateBeneficiaryEndpoint = companion2.create(new BeneficiaryStore8(this, null), new BeneficiaryStore9(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object fetchIntroFlowViewModels(String str, Continuation<? super GetBeneficiaryFlowIntroViewModelsResponse> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.beneficiaryIntroFlowEndpoint, new GetBeneficiaryFlowIntroViewModelsRequest(str, null, 2, 0 == true ? 1 : 0), null, continuation, 2, null);
    }

    public static /* synthetic */ Object fetchCreateFlowViewModels$default(BeneficiaryStore beneficiaryStore, String str, UUID uuid, BeneficiaryType beneficiaryType, BeneficiaryRole beneficiaryRole, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        if ((i & 4) != 0) {
            beneficiaryType = null;
        }
        if ((i & 8) != 0) {
            beneficiaryRole = null;
        }
        return beneficiaryStore.fetchCreateFlowViewModels(str, uuid, beneficiaryType, beneficiaryRole, continuation);
    }

    public final Object fetchCreateFlowViewModels(String str, UUID uuid, BeneficiaryType beneficiaryType, BeneficiaryRole beneficiaryRole, Continuation<? super GetBeneficiaryFlowResponse> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.beneficiaryCreateFlowEndpoint, new GetBeneficiaryFlowRequest(str, uuid != null ? uuid.toString() : null, beneficiaryType, beneficiaryRole, null, 16, null), null, continuation, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object createTrustBeneficiary(String str, String str2, LocalDate localDate, String str3, String str4, List<String> list, List<String> list2, BeneficiaryRole beneficiaryRole, Continuation<? super CreateBeneficiaryResponse> continuation) {
        String string2 = localDate.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        IndividualBeneficiaryInfo individualBeneficiaryInfo = null;
        ByteString byteString = null;
        BeneficiaryInfo beneficiaryInfo = new BeneficiaryInfo(individualBeneficiaryInfo, new TrustBeneficiaryInfo(str2, str3, string2, str4, null, 16, null), byteString, 5, null);
        List<String> list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(new BeneficiarySignedAgreement((String) it.next(), null, 2, 0 == true ? 1 : 0));
        }
        return PostEndpoint.DefaultImpls.post$default(this.createBeneficiaryEndpoint, new CreateBeneficiaryRequest(str, beneficiaryInfo, arrayList, list2, beneficiaryRole, null, 32, null), null, continuation, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object updateTrustBeneficiary(String str, UUID uuid, String str2, LocalDate localDate, String str3, String str4, List<String> list, List<String> list2, Continuation<? super UpdateBeneficiaryResponse> continuation) {
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String string3 = localDate.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        IndividualBeneficiaryInfo individualBeneficiaryInfo = null;
        ByteString byteString = null;
        BeneficiaryInfo beneficiaryInfo = new BeneficiaryInfo(individualBeneficiaryInfo, new TrustBeneficiaryInfo(str2, str3, string3, str4, null, 16, null), byteString, 5, null);
        List<String> list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(new BeneficiarySignedAgreement((String) it.next(), null, 2, 0 == true ? 1 : 0));
        }
        return PostEndpoint.DefaultImpls.post$default(this.updateBeneficiaryEndpoint, new UpdateBeneficiaryRequest(str, string2, beneficiaryInfo, arrayList, list2, null, 32, null), null, continuation, 2, null);
    }
}
