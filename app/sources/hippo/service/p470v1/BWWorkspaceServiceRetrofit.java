package hippo.service.p470v1;

import com.robinhood.android.idl.common.RhGenerated;
import hippo.model.p469v1.WidgetType;
import java.util.Map;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;

/* compiled from: BWWorkspaceServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0003\u000b\f\rJ,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\n\u0010\b¨\u0006\u000e"}, m3636d2 = {"Lhippo/service/v1/BWWorkspaceServiceRetrofit;", "", "", "", "headers", "Lretrofit2/Response;", "Lhippo/service/v1/GetAppSettingsResponseDto;", "GetAppSettings", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhippo/service/v1/GetAllLinkingGroupsResponseDto;", "GetAllLinkingGroups", "UpdateWidgetTypeSettingsBodyTransformer", "UpdateChartDrawingBodyTransformer", "UnsyncChartDrawingBodyTransformer", "hippo.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes18.dex */
public interface BWWorkspaceServiceRetrofit {
    @GET("hippo/bw/groups")
    Object GetAllLinkingGroups(@HeaderMap Map<String, String> map, Continuation<Response<GetAllLinkingGroupsResponseDto>> continuation);

    @GET("hippo/bw/settings")
    Object GetAppSettings(@HeaderMap Map<String, String> map, Continuation<Response<GetAppSettingsResponseDto>> continuation);

    /* compiled from: BWWorkspaceServiceRetrofit.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m3636d2 = {"Lhippo/service/v1/BWWorkspaceServiceRetrofit$UpdateWidgetTypeSettingsBodyTransformer;", "Ljava/util/function/UnaryOperator;", "Lhippo/service/v1/UpdateWidgetTypeSettingsRequest;", "<init>", "()V", "apply", "value", "hippo.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UpdateWidgetTypeSettingsBodyTransformer implements UnaryOperator<UpdateWidgetTypeSettingsRequest> {
        public static final UpdateWidgetTypeSettingsBodyTransformer INSTANCE = new UpdateWidgetTypeSettingsBodyTransformer();

        private UpdateWidgetTypeSettingsBodyTransformer() {
        }

        @Override // java.util.function.Function
        public UpdateWidgetTypeSettingsRequest apply(UpdateWidgetTypeSettingsRequest value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return UpdateWidgetTypeSettingsRequest.copy$default(value, null, WidgetType.WIDGET_TYPE_UNSPECIFIED, null, null, null, null, 61, null);
        }
    }

    /* compiled from: BWWorkspaceServiceRetrofit.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m3636d2 = {"Lhippo/service/v1/BWWorkspaceServiceRetrofit$UpdateChartDrawingBodyTransformer;", "Ljava/util/function/UnaryOperator;", "Lhippo/service/v1/UpdateChartDrawingRequest;", "<init>", "()V", "apply", "value", "hippo.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UpdateChartDrawingBodyTransformer implements UnaryOperator<UpdateChartDrawingRequest> {
        public static final UpdateChartDrawingBodyTransformer INSTANCE = new UpdateChartDrawingBodyTransformer();

        private UpdateChartDrawingBodyTransformer() {
        }

        @Override // java.util.function.Function
        public UpdateChartDrawingRequest apply(UpdateChartDrawingRequest value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return UpdateChartDrawingRequest.copy$default(value, "", null, null, 6, null);
        }
    }

    /* compiled from: BWWorkspaceServiceRetrofit.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m3636d2 = {"Lhippo/service/v1/BWWorkspaceServiceRetrofit$UnsyncChartDrawingBodyTransformer;", "Ljava/util/function/UnaryOperator;", "Lhippo/service/v1/UnsyncChartDrawingRequest;", "<init>", "()V", "apply", "value", "hippo.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UnsyncChartDrawingBodyTransformer implements UnaryOperator<UnsyncChartDrawingRequest> {
        public static final UnsyncChartDrawingBodyTransformer INSTANCE = new UnsyncChartDrawingBodyTransformer();

        private UnsyncChartDrawingBodyTransformer() {
        }

        @Override // java.util.function.Function
        public UnsyncChartDrawingRequest apply(UnsyncChartDrawingRequest value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return UnsyncChartDrawingRequest.copy$default(value, "", null, null, 6, null);
        }
    }
}
