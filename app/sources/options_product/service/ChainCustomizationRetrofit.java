package options_product.service;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import java.util.Map;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.PATCH;

/* compiled from: ChainCustomizationRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0002\r\u000eJ,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m3636d2 = {"Loptions_product/service/ChainCustomizationRetrofit;", "", "", "", "headers", "Lretrofit2/Response;", "Loptions_product/service/SbsChainCustomizationResponseDto;", "GetSbsChainCustomization", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/UpdateSbsChainCustomizationRequestDto;", CarResultComposable2.BODY, "UpdateSbsChainCustomization", "(Ljava/util/Map;Loptions_product/service/UpdateSbsChainCustomizationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "UpdateChainCustomizationBodyTransformer", "UpdateBuilderCustomizationBodyTransformer", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes25.dex */
public interface ChainCustomizationRetrofit {
    @GET("options-product/sbs-chain/customizations")
    Object GetSbsChainCustomization(@HeaderMap Map<String, String> map, Continuation<Response<SbsChainCustomizationResponseDto>> continuation);

    @PATCH("options-product/sbs-chain/customizations")
    Object UpdateSbsChainCustomization(@HeaderMap Map<String, String> map, @Body UpdateSbsChainCustomizationRequestDto updateSbsChainCustomizationRequestDto, Continuation<Response<SbsChainCustomizationResponseDto>> continuation);

    /* compiled from: ChainCustomizationRetrofit.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m3636d2 = {"Loptions_product/service/ChainCustomizationRetrofit$UpdateChainCustomizationBodyTransformer;", "Ljava/util/function/UnaryOperator;", "Loptions_product/service/UpdateChainCustomizationRequest;", "<init>", "()V", "apply", "value", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UpdateChainCustomizationBodyTransformer implements UnaryOperator<UpdateChainCustomizationRequest> {
        public static final UpdateChainCustomizationBodyTransformer INSTANCE = new UpdateChainCustomizationBodyTransformer();

        private UpdateChainCustomizationBodyTransformer() {
        }

        @Override // java.util.function.Function
        public UpdateChainCustomizationRequest apply(UpdateChainCustomizationRequest value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return UpdateChainCustomizationRequest.copy$default(value, "", null, null, null, 14, null);
        }
    }

    /* compiled from: ChainCustomizationRetrofit.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m3636d2 = {"Loptions_product/service/ChainCustomizationRetrofit$UpdateBuilderCustomizationBodyTransformer;", "Ljava/util/function/UnaryOperator;", "Loptions_product/service/UpdateBuilderCustomizationRequest;", "<init>", "()V", "apply", "value", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UpdateBuilderCustomizationBodyTransformer implements UnaryOperator<UpdateBuilderCustomizationRequest> {
        public static final UpdateBuilderCustomizationBodyTransformer INSTANCE = new UpdateBuilderCustomizationBodyTransformer();

        private UpdateBuilderCustomizationBodyTransformer() {
        }

        @Override // java.util.function.Function
        public UpdateBuilderCustomizationRequest apply(UpdateBuilderCustomizationRequest value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return UpdateBuilderCustomizationRequest.copy$default(value, "", null, null, null, 14, null);
        }
    }
}
