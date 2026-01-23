package com.robinhood.shared.crypto.perpetuals.api;

import com.plaid.internal.EnumC7081g;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.crypto.models.perpetuals.p289ui.PerpetualErrorDetails;
import com.robinhood.utils.Json2;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.moshi.jsonadapter.StackAmendingJsonAdapterFactory;
import com.robinhood.utils.resource.StringResource;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.wire.AnyMessage;
import crypto_perpetuals.common.p435v1.CTAActionDto;
import crypto_perpetuals.common.p435v1.CTADto;
import crypto_perpetuals.common.p435v1.ErrorDetailsDto;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import okio.ByteString;
import retrofit2.HttpException;
import retrofit2.Response;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.ButtonTypeDto;
import rh_server_driven_ui.p531v1.DeepLinkAction;
import rh_server_driven_ui.p531v1.DismissAction;
import rh_server_driven_ui.p531v1.GenericAction;

/* compiled from: PerpetualsErrorParser.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0005\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"errorAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/shared/crypto/perpetuals/api/PerpetualErrorDetailsResponse;", "extractPerpetualErrorDetails", "Lcom/robinhood/crypto/models/perpetuals/ui/PerpetualErrorDetails;", "", "lib-api_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.perpetuals.api.PerpetualsErrorParserKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PerpetualsErrorParser3 {
    private static final JsonAdapter<PerpetualErrorDetailsResponse> errorAdapter;

    /* JADX WARN: Multi-variable type inference failed */
    public static final PerpetualErrorDetails extractPerpetualErrorDetails(Throwable th) {
        Response<?> response;
        String strExtractErrorBodyString;
        PerpetualErrorDetailsResponse perpetualErrorDetailsResponseFromJson;
        List<ErrorDetailsDto> details;
        ErrorDetailsDto errorDetailsDto;
        String uri;
        ActionDto actionDto;
        Intrinsics.checkNotNullParameter(th, "<this>");
        ByteString byteString = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            HttpException httpException = (HttpException) Throwables.findCause(th, HttpException.class);
            if (httpException != null && (response = httpException.response()) != null && (strExtractErrorBodyString = NetworkThrowables.extractErrorBodyString(response)) != null && (perpetualErrorDetailsResponseFromJson = errorAdapter.fromJson(strExtractErrorBodyString)) != null && (details = perpetualErrorDetailsResponseFromJson.getDetails()) != null && (errorDetailsDto = (ErrorDetailsDto) CollectionsKt.firstOrNull((List) details)) != null) {
                ActionDto actionDto2 = new ActionDto(AnyMessage.INSTANCE.pack(new GenericAction(new DismissAction(false, byteString, 3, objArr3 == true ? 1 : 0), null, null, null, 14, null)));
                StringResource.Companion companion = StringResource.INSTANCE;
                StringResource stringResourceInvoke = companion.invoke(errorDetailsDto.getTitle());
                StringResource stringResourceInvoke2 = companion.invoke(errorDetailsDto.getMessage());
                List<CTADto> ctas = errorDetailsDto.getCtas();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(ctas, 10));
                for (CTADto cTADto : ctas) {
                    String label = cTADto.getLabel();
                    CTAActionDto action = cTADto.getAction();
                    if (action == null || !Intrinsics.areEqual(action.getSdui_action_type(), "deeplink") || (uri = action.getUri()) == null) {
                        actionDto = actionDto2;
                    } else {
                        actionDto = new ActionDto(AnyMessage.INSTANCE.pack(new GenericAction(null, new DeepLinkAction(uri, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0), null, null, 13, null)));
                    }
                    arrayList.add(new ButtonDto(actionDto, label, Intrinsics.areEqual(cTADto.getType(), "PRIMARY") ? ButtonTypeDto.BUTTON_TYPE_PRIMARY : ButtonTypeDto.BUTTON_TYPE_SECONDARY, null, cTADto.getLogging_identifier(), null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, null));
                }
                return new PerpetualErrorDetails(stringResourceInvoke, stringResourceInvoke2, extensions2.toPersistentList(arrayList));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    static {
        LazyMoshi lazyMoshi = new LazyMoshi(new Lazy() { // from class: com.robinhood.shared.crypto.perpetuals.api.PerpetualsErrorParserKt$errorAdapter$1
            @Override // dagger.Lazy
            public final Moshi get() {
                Moshi.Builder builderAdd = new Moshi.Builder().add((JsonAdapter.Factory) StackAmendingJsonAdapterFactory.INSTANCE);
                Json2.addGenericAdapters$default(builderAdd, null, 1, null);
                Moshi moshiBuild = builderAdd.build();
                Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
                return moshiBuild;
            }
        });
        Types types = Types.INSTANCE;
        errorAdapter = lazyMoshi.adapter(new TypeToken<PerpetualErrorDetailsResponse>() { // from class: com.robinhood.shared.crypto.perpetuals.api.PerpetualsErrorParserKt$special$$inlined$getAdapter$1
        }.getType());
    }
}
