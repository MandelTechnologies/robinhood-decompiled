package com.robinhood.android.isa.isatransferfunds.microgram;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.librobinhood.data.store.identi.AddressStore;
import com.robinhood.librobinhood.data.store.identi.FullNinStore;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.models.p355ui.identi.ResidentialAddress;
import com.robinhood.models.p355ui.identi.UiFullNin;
import com.robinhood.models.p355ui.identi.UiProfileInfo;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.contracts.isa_transfer_funds.proto.p495v1.IsaTransferFundsPersonalInfoService;
import microgram.contracts.isa_transfer_funds.proto.p495v1.StreamPersonalInfoRequestDto;
import microgram.contracts.isa_transfer_funds.proto.p495v1.StreamPersonalInfoResponseDto;

/* compiled from: RealIsaTransferFundsPersonalInfoService.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/isa/isatransferfunds/microgram/RealIsaTransferFundsPersonalInfoService;", "Lmicrogram/contracts/isa_transfer_funds/proto/v1/IsaTransferFundsPersonalInfoService;", "fullNinStore", "Lcom/robinhood/librobinhood/data/store/identi/FullNinStore;", "profileInfoStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "addressStore", "Lcom/robinhood/librobinhood/data/store/identi/AddressStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/FullNinStore;Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;Lcom/robinhood/librobinhood/data/store/identi/AddressStore;)V", "StreamPersonalInfo", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponseDto;", "request", "Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoRequestDto;", "feature-isa-transfer-funds_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class RealIsaTransferFundsPersonalInfoService implements IsaTransferFundsPersonalInfoService {
    public static final int $stable = 8;
    private final AddressStore addressStore;
    private final FullNinStore fullNinStore;
    private final ProfileInfoStore profileInfoStore;

    public Flow<Response<StreamPersonalInfoResponseDto>> StreamPersonalInfo(Request<StreamPersonalInfoRequestDto> request) {
        return IsaTransferFundsPersonalInfoService.DefaultImpls.StreamPersonalInfo(this, request);
    }

    public RealIsaTransferFundsPersonalInfoService(FullNinStore fullNinStore, ProfileInfoStore profileInfoStore, AddressStore addressStore) {
        Intrinsics.checkNotNullParameter(fullNinStore, "fullNinStore");
        Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
        Intrinsics.checkNotNullParameter(addressStore, "addressStore");
        this.fullNinStore = fullNinStore;
        this.profileInfoStore = profileInfoStore;
        this.addressStore = addressStore;
    }

    @Override // microgram.contracts.isa_transfer_funds.proto.p495v1.IsaTransferFundsPersonalInfoService
    public Flow<StreamPersonalInfoResponseDto> StreamPersonalInfo(StreamPersonalInfoRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ProfileInfoStore.refreshProfileInfo$default(this.profileInfoStore, false, 1, null);
        this.addressStore.refreshResidentialAddress(true);
        return FlowKt.combine(this.fullNinStore.streamFullNin(), Context7.buffer$default(RxConvert.asFlow(this.profileInfoStore.streamProfileInfo()), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(this.addressStore.streamResidentialAddress()), Integer.MAX_VALUE, null, 2, null), new C199391(null));
    }

    /* compiled from: RealIsaTransferFundsPersonalInfoService.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponseDto;", "fullNin", "Lcom/robinhood/models/ui/identi/UiFullNin;", "profileInfo", "Lcom/robinhood/models/ui/identi/UiProfileInfo;", "residentialAddress", "Lcom/robinhood/models/ui/identi/ResidentialAddress;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.isa.isatransferfunds.microgram.RealIsaTransferFundsPersonalInfoService$StreamPersonalInfo$1", m3645f = "RealIsaTransferFundsPersonalInfoService.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.isa.isatransferfunds.microgram.RealIsaTransferFundsPersonalInfoService$StreamPersonalInfo$1 */
    static final class C199391 extends ContinuationImpl7 implements Function4<UiFullNin, UiProfileInfo, ResidentialAddress, Continuation<? super StreamPersonalInfoResponseDto>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        C199391(Continuation<? super C199391> continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(UiFullNin uiFullNin, UiProfileInfo uiProfileInfo, ResidentialAddress residentialAddress, Continuation<? super StreamPersonalInfoResponseDto> continuation) {
            C199391 c199391 = new C199391(continuation);
            c199391.L$0 = uiFullNin;
            c199391.L$1 = uiProfileInfo;
            c199391.L$2 = residentialAddress;
            return c199391.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UiFullNin uiFullNin = (UiFullNin) this.L$0;
            UiProfileInfo uiProfileInfo = (UiProfileInfo) this.L$1;
            ResidentialAddress residentialAddress = (ResidentialAddress) this.L$2;
            return new StreamPersonalInfoResponseDto(uiProfileInfo.getFirstName() + PlaceholderUtils.XXShortPlaceholderText + uiProfileInfo.getLastName(), LocalDateFormatter.SHORT_WITH_FULL_YEAR.format(uiProfileInfo.getDateOfBirth()), uiFullNin.getNin(), residentialAddress.getAddress().getDisplayMultiline());
        }
    }
}
