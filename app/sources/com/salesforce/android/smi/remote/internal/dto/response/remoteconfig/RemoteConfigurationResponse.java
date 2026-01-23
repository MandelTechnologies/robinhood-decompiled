package com.salesforce.android.smi.remote.internal.dto.response.remoteconfig;

import com.salesforce.android.smi.network.data.domain.prechat.PreChatField;
import com.salesforce.android.smi.network.data.domain.prechat.choicelist.ChoiceList;
import com.salesforce.android.smi.network.data.domain.prechat.choicelist.ChoiceListConfiguration;
import com.salesforce.android.smi.network.data.domain.prechat.choicelist.ChoiceListField;
import com.salesforce.android.smi.network.internal.dto.response.remoteconfig.PreChatConfiguration;
import com.salesforce.android.smi.network.internal.dto.response.remoteconfig.RemoteConfiguration;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RemoteConfigurationResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/response/remoteconfig/RemoteConfigurationResponse;", "", "embeddedServiceConfig", "Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/RemoteConfiguration;", "timestamp", "", "<init>", "(Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/RemoteConfiguration;J)V", "getTimestamp", "()J", "getEmbeddedServiceConfig", "()Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/RemoteConfiguration;", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class RemoteConfigurationResponse {
    private final RemoteConfiguration embeddedServiceConfig;
    private final long timestamp;

    public RemoteConfigurationResponse(RemoteConfiguration embeddedServiceConfig, long j) {
        List<PreChatField> hiddenFormFields;
        List<PreChatField> formFields;
        List<ChoiceList> choiceList;
        Object next;
        Intrinsics.checkNotNullParameter(embeddedServiceConfig, "embeddedServiceConfig");
        this.timestamp = j;
        RemoteConfiguration remoteConfigurationCopy$default = RemoteConfiguration.copy$default(embeddedServiceConfig, null, null, null, null, null, null, null, null, j, 255, null);
        ChoiceListConfiguration choiceListConfiguration = remoteConfigurationCopy$default.getChoiceListConfiguration();
        PreChatConfiguration preChatConfiguration = (PreChatConfiguration) CollectionsKt.firstOrNull((List) remoteConfigurationCopy$default.getForms());
        if (preChatConfiguration != null && (formFields = preChatConfiguration.getFormFields()) != null) {
            ArrayList<ChoiceListField> arrayList = new ArrayList();
            for (Object obj : formFields) {
                if (obj instanceof ChoiceListField) {
                    arrayList.add(obj);
                }
            }
            for (ChoiceListField choiceListField : arrayList) {
                if (choiceListConfiguration != null && (choiceList = choiceListConfiguration.getChoiceList()) != null) {
                    Iterator<T> it = choiceList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (Intrinsics.areEqual(((ChoiceList) next).getChoiceListId(), choiceListField.getChoiceListId())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    ChoiceList choiceList2 = (ChoiceList) next;
                    if (choiceList2 != null) {
                        choiceListField.setChoiceList(choiceList2);
                    }
                }
            }
        }
        if (preChatConfiguration != null && (hiddenFormFields = preChatConfiguration.getHiddenFormFields()) != null) {
            Iterator<T> it2 = hiddenFormFields.iterator();
            while (it2.hasNext()) {
                ((PreChatField) it2.next()).setHidden(true);
            }
        }
        this.embeddedServiceConfig = remoteConfigurationCopy$default;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final RemoteConfiguration getEmbeddedServiceConfig() {
        return this.embeddedServiceConfig;
    }
}
