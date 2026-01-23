package com.robinhood.android.odyssey.lib.template;

import com.robinhood.models.api.serverdrivenui.ApiSdPayloadValue;
import com.robinhood.models.api.serverdrivenui.ApiSdSubmitPayloadRequest;
import com.robinhood.models.api.serverdrivenui.component.ApiSdEntityComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdPageDependency;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdBackendMetadata.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0007\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\t\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u000b"}, m3636d2 = {"sdBackendMetaData", "Lcom/robinhood/android/odyssey/lib/template/SdBackendMetadata;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPageDependency;", "getSdBackendMetaData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPageDependency;)Lcom/robinhood/android/odyssey/lib/template/SdBackendMetadata;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdEntityComponent;", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdEntityComponent;)Lcom/robinhood/android/odyssey/lib/template/SdBackendMetadata;", "toApiSdSubmitPayloadRequest", "Lcom/robinhood/models/api/serverdrivenui/ApiSdSubmitPayloadRequest;", "", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.odyssey.lib.template.SdBackendMetadataKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class SdBackendMetadata2 {
    public static final SdBackendMetadata getSdBackendMetaData(ApiSdPageDependency apiSdPageDependency) {
        Intrinsics.checkNotNullParameter(apiSdPageDependency, "<this>");
        return new SdBackendMetadata(apiSdPageDependency.getEntity_field(), apiSdPageDependency.getEntity_name());
    }

    public static final SdBackendMetadata getSdBackendMetaData(ApiSdEntityComponent apiSdEntityComponent) {
        Intrinsics.checkNotNullParameter(apiSdEntityComponent, "<this>");
        return new SdBackendMetadata(apiSdEntityComponent.getField(), apiSdEntityComponent.getEntity());
    }

    public static final ApiSdSubmitPayloadRequest toApiSdSubmitPayloadRequest(Map<SdBackendMetadata, ? extends ApiSdTypedValue> map) {
        Object nullPayLoadValue;
        Intrinsics.checkNotNullParameter(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<SdBackendMetadata, ? extends ApiSdTypedValue> entry : map.entrySet()) {
            SdBackendMetadata key = entry.getKey();
            ApiSdTypedValue value = entry.getValue();
            if (value instanceof ApiSdTypedValue.ApiSdString) {
                nullPayLoadValue = new ApiSdPayloadValue.StringPayloadValue(key.getEntityName(), key.getEntityField(), ((ApiSdTypedValue.ApiSdString) value).getValue());
            } else if (value instanceof ApiSdTypedValue.ApiSdBoolean) {
                nullPayLoadValue = new ApiSdPayloadValue.BooleanPayloadValue(key.getEntityName(), key.getEntityField(), ((ApiSdTypedValue.ApiSdBoolean) value).getValue());
            } else if (value instanceof ApiSdTypedValue.ApiSdDecimal) {
                nullPayLoadValue = new ApiSdPayloadValue.DecimalPayloadValue(key.getEntityName(), key.getEntityField(), ((ApiSdTypedValue.ApiSdDecimal) value).getValue());
            } else if (value instanceof ApiSdTypedValue.ApiSdInteger) {
                nullPayLoadValue = new ApiSdPayloadValue.IntegerPayloadValue(key.getEntityName(), key.getEntityField(), ((ApiSdTypedValue.ApiSdInteger) value).getValue());
            } else {
                if (!(value instanceof ApiSdTypedValue.ApiSdNull)) {
                    throw new NoWhenBranchMatchedException();
                }
                nullPayLoadValue = new ApiSdPayloadValue.NullPayLoadValue(key.getEntityName(), key.getEntityField());
            }
            arrayList.add(nullPayLoadValue);
        }
        return new ApiSdSubmitPayloadRequest(arrayList, null, null, null, 14, null);
    }
}
