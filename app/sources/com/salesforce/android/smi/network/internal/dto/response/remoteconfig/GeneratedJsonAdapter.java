package com.salesforce.android.smi.network.internal.dto.response.remoteconfig;

import com.salesforce.android.smi.network.data.domain.prechat.choicelist.ChoiceListConfiguration;
import com.salesforce.android.smi.network.data.domain.prechat.termsAndConditions.TermsAndConditions;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RemoteConfigurationJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u001e\u001a\u00020\nH\u0016J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/RemoteConfigurationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/RemoteConfiguration;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "deploymentTypeAdapter", "Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/DeploymentType;", "listOfPreChatConfigurationAdapter", "", "Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/PreChatConfiguration;", "nullableChoiceListConfigurationAdapter", "Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceListConfiguration;", "nullableTermsAndConditionsAdapter", "Lcom/salesforce/android/smi/network/data/domain/prechat/termsAndConditions/TermsAndConditions;", "attachmentConfigurationAdapter", "Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/AttachmentConfiguration;", "transcriptConfigurationAdapter", "Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/TranscriptConfiguration;", "fallbackMessageConfigurationAdapter", "Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/FallbackMessageConfiguration;", "longAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.salesforce.android.smi.network.internal.dto.response.remoteconfig.RemoteConfigurationJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<RemoteConfiguration> {
    private final JsonAdapter<AttachmentConfiguration> attachmentConfigurationAdapter;
    private volatile Constructor<RemoteConfiguration> constructorRef;
    private final JsonAdapter<DeploymentType> deploymentTypeAdapter;
    private final JsonAdapter<FallbackMessageConfiguration> fallbackMessageConfigurationAdapter;
    private final JsonAdapter<List<PreChatConfiguration>> listOfPreChatConfigurationAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<ChoiceListConfiguration> nullableChoiceListConfigurationAdapter;
    private final JsonAdapter<TermsAndConditions> nullableTermsAndConditionsAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TranscriptConfiguration> transcriptConfigurationAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("name", "deploymentType", "forms", "choiceListConfig", "termsAndConditions", "attachments", "transcript", "fallbackMessage", "timestamp");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "name");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<DeploymentType> jsonAdapterAdapter2 = moshi.adapter(DeploymentType.class, SetsKt.emptySet(), "deploymentType");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.deploymentTypeAdapter = jsonAdapterAdapter2;
        JsonAdapter<List<PreChatConfiguration>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(List.class, PreChatConfiguration.class), SetsKt.emptySet(), "forms");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.listOfPreChatConfigurationAdapter = jsonAdapterAdapter3;
        JsonAdapter<ChoiceListConfiguration> jsonAdapterAdapter4 = moshi.adapter(ChoiceListConfiguration.class, SetsKt.emptySet(), "choiceListConfiguration");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableChoiceListConfigurationAdapter = jsonAdapterAdapter4;
        JsonAdapter<TermsAndConditions> jsonAdapterAdapter5 = moshi.adapter(TermsAndConditions.class, SetsKt.emptySet(), "termsAndConditions");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.nullableTermsAndConditionsAdapter = jsonAdapterAdapter5;
        JsonAdapter<AttachmentConfiguration> jsonAdapterAdapter6 = moshi.adapter(AttachmentConfiguration.class, SetsKt.emptySet(), "attachments");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter6, "adapter(...)");
        this.attachmentConfigurationAdapter = jsonAdapterAdapter6;
        JsonAdapter<TranscriptConfiguration> jsonAdapterAdapter7 = moshi.adapter(TranscriptConfiguration.class, SetsKt.emptySet(), "transcript");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter7, "adapter(...)");
        this.transcriptConfigurationAdapter = jsonAdapterAdapter7;
        JsonAdapter<FallbackMessageConfiguration> jsonAdapterAdapter8 = moshi.adapter(FallbackMessageConfiguration.class, SetsKt.emptySet(), "fallbackMessage");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter8, "adapter(...)");
        this.fallbackMessageConfigurationAdapter = jsonAdapterAdapter8;
        JsonAdapter<Long> jsonAdapterAdapter9 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "timestamp");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter9, "adapter(...)");
        this.longAdapter = jsonAdapterAdapter9;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RemoteConfiguration");
        sb.append(')');
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public RemoteConfiguration fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        DeploymentType deploymentTypeFromJson = null;
        Long lFromJson = 0L;
        String strFromJson = null;
        ChoiceListConfiguration choiceListConfigurationFromJson = null;
        TermsAndConditions termsAndConditionsFromJson = null;
        AttachmentConfiguration attachmentConfigurationFromJson = null;
        TranscriptConfiguration transcriptConfigurationFromJson = null;
        FallbackMessageConfiguration fallbackMessageConfigurationFromJson = null;
        int i = -1;
        List<PreChatConfiguration> listFromJson = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw Util.unexpectedNull("name", "name", reader);
                    }
                    break;
                case 1:
                    deploymentTypeFromJson = this.deploymentTypeAdapter.fromJson(reader);
                    if (deploymentTypeFromJson == null) {
                        throw Util.unexpectedNull("deploymentType", "deploymentType", reader);
                    }
                    break;
                case 2:
                    listFromJson = this.listOfPreChatConfigurationAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw Util.unexpectedNull("forms", "forms", reader);
                    }
                    break;
                case 3:
                    choiceListConfigurationFromJson = this.nullableChoiceListConfigurationAdapter.fromJson(reader);
                    break;
                case 4:
                    termsAndConditionsFromJson = this.nullableTermsAndConditionsAdapter.fromJson(reader);
                    break;
                case 5:
                    attachmentConfigurationFromJson = this.attachmentConfigurationAdapter.fromJson(reader);
                    if (attachmentConfigurationFromJson == null) {
                        throw Util.unexpectedNull("attachments", "attachments", reader);
                    }
                    i &= -33;
                    break;
                case 6:
                    transcriptConfigurationFromJson = this.transcriptConfigurationAdapter.fromJson(reader);
                    if (transcriptConfigurationFromJson == null) {
                        throw Util.unexpectedNull("transcript", "transcript", reader);
                    }
                    i &= -65;
                    break;
                case 7:
                    fallbackMessageConfigurationFromJson = this.fallbackMessageConfigurationAdapter.fromJson(reader);
                    if (fallbackMessageConfigurationFromJson == null) {
                        throw Util.unexpectedNull("fallbackMessage", "fallbackMessage", reader);
                    }
                    i &= -129;
                    break;
                case 8:
                    lFromJson = this.longAdapter.fromJson(reader);
                    if (lFromJson == null) {
                        throw Util.unexpectedNull("timestamp", "timestamp", reader);
                    }
                    i &= -257;
                    break;
            }
        }
        reader.endObject();
        if (i == -481) {
            if (strFromJson == null) {
                throw Util.missingProperty("name", "name", reader);
            }
            if (deploymentTypeFromJson == null) {
                throw Util.missingProperty("deploymentType", "deploymentType", reader);
            }
            if (listFromJson == null) {
                throw Util.missingProperty("forms", "forms", reader);
            }
            Intrinsics.checkNotNull(attachmentConfigurationFromJson, "null cannot be cast to non-null type com.salesforce.android.smi.network.internal.dto.response.remoteconfig.AttachmentConfiguration");
            Intrinsics.checkNotNull(transcriptConfigurationFromJson, "null cannot be cast to non-null type com.salesforce.android.smi.network.internal.dto.response.remoteconfig.TranscriptConfiguration");
            Intrinsics.checkNotNull(fallbackMessageConfigurationFromJson, "null cannot be cast to non-null type com.salesforce.android.smi.network.internal.dto.response.remoteconfig.FallbackMessageConfiguration");
            return new RemoteConfiguration(strFromJson, deploymentTypeFromJson, listFromJson, choiceListConfigurationFromJson, termsAndConditionsFromJson, attachmentConfigurationFromJson, transcriptConfigurationFromJson, fallbackMessageConfigurationFromJson, lFromJson.longValue());
        }
        Constructor<RemoteConfiguration> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            str = strFromJson;
            declaredConstructor = RemoteConfiguration.class.getDeclaredConstructor(String.class, DeploymentType.class, List.class, ChoiceListConfiguration.class, TermsAndConditions.class, AttachmentConfiguration.class, TranscriptConfiguration.class, FallbackMessageConfiguration.class, Long.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        } else {
            str = strFromJson;
        }
        if (str == null) {
            throw Util.missingProperty("name", "name", reader);
        }
        if (deploymentTypeFromJson == null) {
            throw Util.missingProperty("deploymentType", "deploymentType", reader);
        }
        if (listFromJson == null) {
            throw Util.missingProperty("forms", "forms", reader);
        }
        TranscriptConfiguration transcriptConfiguration = transcriptConfigurationFromJson;
        FallbackMessageConfiguration fallbackMessageConfiguration = fallbackMessageConfigurationFromJson;
        ChoiceListConfiguration choiceListConfiguration = choiceListConfigurationFromJson;
        TermsAndConditions termsAndConditions = termsAndConditionsFromJson;
        String str2 = str;
        DeploymentType deploymentType = deploymentTypeFromJson;
        RemoteConfiguration remoteConfigurationNewInstance = declaredConstructor.newInstance(str2, deploymentType, listFromJson, choiceListConfiguration, termsAndConditions, attachmentConfigurationFromJson, transcriptConfiguration, fallbackMessageConfiguration, lFromJson, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(remoteConfigurationNewInstance, "newInstance(...)");
        return remoteConfigurationNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, RemoteConfiguration value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("name");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getName());
        writer.name("deploymentType");
        this.deploymentTypeAdapter.toJson(writer, (JsonWriter) value_.getDeploymentType());
        writer.name("forms");
        this.listOfPreChatConfigurationAdapter.toJson(writer, (JsonWriter) value_.getForms());
        writer.name("choiceListConfig");
        this.nullableChoiceListConfigurationAdapter.toJson(writer, (JsonWriter) value_.getChoiceListConfiguration());
        writer.name("termsAndConditions");
        this.nullableTermsAndConditionsAdapter.toJson(writer, (JsonWriter) value_.getTermsAndConditions());
        writer.name("attachments");
        this.attachmentConfigurationAdapter.toJson(writer, (JsonWriter) value_.getAttachments());
        writer.name("transcript");
        this.transcriptConfigurationAdapter.toJson(writer, (JsonWriter) value_.getTranscript());
        writer.name("fallbackMessage");
        this.fallbackMessageConfigurationAdapter.toJson(writer, (JsonWriter) value_.getFallbackMessage());
        writer.name("timestamp");
        this.longAdapter.toJson(writer, (JsonWriter) Long.valueOf(value_.getTimestamp()));
        writer.endObject();
    }
}
