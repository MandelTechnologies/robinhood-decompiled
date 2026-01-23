package com.salesforce.android.smi.remote.internal.adapters;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.ConversationEntryType;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.RoutingType;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.event.ParticipantChangedOperation;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.AttachmentType;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.progressIndicators.ProgressIndicatorType;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.routing.RoutingFailureType;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.routing.RoutingWorkType;
import com.salesforce.android.smi.network.data.domain.participant.ParticipantRoleType;
import com.salesforce.android.smi.network.data.domain.prechat.PreChatFieldType;
import com.salesforce.android.smi.network.internal.dto.response.remoteconfig.DeploymentType;
import com.salesforce.android.smi.network.internal.dto.response.remoteconfig.FormType;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.EnumJsonAdapter;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InAppMoshi.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/adapters/InAppMoshi;", "", "<init>", "()V", "instance", "Lcom/squareup/moshi/Moshi;", "getInstance", "()Lcom/squareup/moshi/Moshi;", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class InAppMoshi {
    public static final InAppMoshi INSTANCE = new InAppMoshi();
    private static final Moshi instance;

    private InAppMoshi() {
    }

    public final Moshi getInstance() {
        return instance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        PolymorphicAdapterFactory polymorphicAdapterFactory = new PolymorphicAdapterFactory(null, 1, 0 == true ? 1 : 0);
        Moshi.Builder builderAdd = new Moshi.Builder().add((JsonAdapter.Factory) polymorphicAdapterFactory.entryAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.messageAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.staticFormatAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.attachmentFileTypeAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.choicesFormatAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.choicesResponseFormatAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.optionItemAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.titleItemAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.preChatFieldTypeAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.formFormatAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.formResponseFormatAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.inputSectionAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.inputAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.inputValueAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.formResultAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.formResponseValueAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.progressIndicatorFormatAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.streamingTokenAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.streamingTokenMessageFormatAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.citedReferenceAdapter()).add((JsonAdapter.Factory) polymorphicAdapterFactory.citedDetailsAdapter());
        Intrinsics.checkNotNullExpressionValue(builderAdd, "add(...)");
        ProgressIndicatorType progressIndicatorType = ProgressIndicatorType.ProgressUpdateIndicator;
        EnumJsonAdapter enumJsonAdapterCreate = EnumJsonAdapter.create(ProgressIndicatorType.class);
        if (progressIndicatorType == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.progressIndicators.ProgressIndicatorType");
        }
        EnumJsonAdapter enumJsonAdapterWithUnknownFallback = enumJsonAdapterCreate.withUnknownFallback(progressIndicatorType);
        Intrinsics.checkNotNullExpressionValue(enumJsonAdapterWithUnknownFallback, "withUnknownFallback(...)");
        Moshi.Builder builderAdd2 = builderAdd.add(ProgressIndicatorType.class, enumJsonAdapterWithUnknownFallback);
        Intrinsics.checkNotNullExpressionValue(builderAdd2, "add(...)");
        ParticipantRoleType participantRoleType = ParticipantRoleType.Unknown;
        EnumJsonAdapter enumJsonAdapterCreate2 = EnumJsonAdapter.create(ParticipantRoleType.class);
        if (participantRoleType == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.salesforce.android.smi.network.data.domain.participant.ParticipantRoleType");
        }
        EnumJsonAdapter enumJsonAdapterWithUnknownFallback2 = enumJsonAdapterCreate2.withUnknownFallback(participantRoleType);
        Intrinsics.checkNotNullExpressionValue(enumJsonAdapterWithUnknownFallback2, "withUnknownFallback(...)");
        Moshi.Builder builderAdd3 = builderAdd2.add(ParticipantRoleType.class, enumJsonAdapterWithUnknownFallback2);
        Intrinsics.checkNotNullExpressionValue(builderAdd3, "add(...)");
        ConversationEntryType conversationEntryType = ConversationEntryType.UnknownEntry;
        EnumJsonAdapter enumJsonAdapterCreate3 = EnumJsonAdapter.create(ConversationEntryType.class);
        if (conversationEntryType == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.ConversationEntryType");
        }
        EnumJsonAdapter enumJsonAdapterWithUnknownFallback3 = enumJsonAdapterCreate3.withUnknownFallback(conversationEntryType);
        Intrinsics.checkNotNullExpressionValue(enumJsonAdapterWithUnknownFallback3, "withUnknownFallback(...)");
        Moshi.Builder builderAdd4 = builderAdd3.add(ConversationEntryType.class, enumJsonAdapterWithUnknownFallback3);
        Intrinsics.checkNotNullExpressionValue(builderAdd4, "add(...)");
        PreChatFieldType preChatFieldType = PreChatFieldType.Text;
        EnumJsonAdapter enumJsonAdapterCreate4 = EnumJsonAdapter.create(PreChatFieldType.class);
        if (preChatFieldType == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.salesforce.android.smi.network.data.domain.prechat.PreChatFieldType");
        }
        EnumJsonAdapter enumJsonAdapterWithUnknownFallback4 = enumJsonAdapterCreate4.withUnknownFallback(preChatFieldType);
        Intrinsics.checkNotNullExpressionValue(enumJsonAdapterWithUnknownFallback4, "withUnknownFallback(...)");
        Moshi.Builder builderAdd5 = builderAdd4.add(PreChatFieldType.class, enumJsonAdapterWithUnknownFallback4);
        Intrinsics.checkNotNullExpressionValue(builderAdd5, "add(...)");
        DeploymentType deploymentType = DeploymentType.Mobile;
        EnumJsonAdapter enumJsonAdapterCreate5 = EnumJsonAdapter.create(DeploymentType.class);
        if (deploymentType == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.salesforce.android.smi.network.internal.dto.response.remoteconfig.DeploymentType");
        }
        EnumJsonAdapter enumJsonAdapterWithUnknownFallback5 = enumJsonAdapterCreate5.withUnknownFallback(deploymentType);
        Intrinsics.checkNotNullExpressionValue(enumJsonAdapterWithUnknownFallback5, "withUnknownFallback(...)");
        Moshi.Builder builderAdd6 = builderAdd5.add(DeploymentType.class, enumJsonAdapterWithUnknownFallback5);
        Intrinsics.checkNotNullExpressionValue(builderAdd6, "add(...)");
        ParticipantChangedOperation participantChangedOperation = ParticipantChangedOperation.Unknown;
        EnumJsonAdapter enumJsonAdapterCreate6 = EnumJsonAdapter.create(ParticipantChangedOperation.class);
        if (participantChangedOperation == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.event.ParticipantChangedOperation");
        }
        EnumJsonAdapter enumJsonAdapterWithUnknownFallback6 = enumJsonAdapterCreate6.withUnknownFallback(participantChangedOperation);
        Intrinsics.checkNotNullExpressionValue(enumJsonAdapterWithUnknownFallback6, "withUnknownFallback(...)");
        Moshi.Builder builderAdd7 = builderAdd6.add(ParticipantChangedOperation.class, enumJsonAdapterWithUnknownFallback6);
        Intrinsics.checkNotNullExpressionValue(builderAdd7, "add(...)");
        RoutingType routingType = RoutingType.Unknown;
        EnumJsonAdapter enumJsonAdapterCreate7 = EnumJsonAdapter.create(RoutingType.class);
        if (routingType == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.RoutingType");
        }
        EnumJsonAdapter enumJsonAdapterWithUnknownFallback7 = enumJsonAdapterCreate7.withUnknownFallback(routingType);
        Intrinsics.checkNotNullExpressionValue(enumJsonAdapterWithUnknownFallback7, "withUnknownFallback(...)");
        Moshi.Builder builderAdd8 = builderAdd7.add(RoutingType.class, enumJsonAdapterWithUnknownFallback7);
        Intrinsics.checkNotNullExpressionValue(builderAdd8, "add(...)");
        RoutingWorkType routingWorkType = RoutingWorkType.Unknown;
        EnumJsonAdapter enumJsonAdapterCreate8 = EnumJsonAdapter.create(RoutingWorkType.class);
        if (routingWorkType == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.routing.RoutingWorkType");
        }
        EnumJsonAdapter enumJsonAdapterWithUnknownFallback8 = enumJsonAdapterCreate8.withUnknownFallback(routingWorkType);
        Intrinsics.checkNotNullExpressionValue(enumJsonAdapterWithUnknownFallback8, "withUnknownFallback(...)");
        Moshi.Builder builderAdd9 = builderAdd8.add(RoutingWorkType.class, enumJsonAdapterWithUnknownFallback8);
        Intrinsics.checkNotNullExpressionValue(builderAdd9, "add(...)");
        RoutingFailureType routingFailureType = RoutingFailureType.Unknown;
        EnumJsonAdapter enumJsonAdapterCreate9 = EnumJsonAdapter.create(RoutingFailureType.class);
        if (routingFailureType == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.routing.RoutingFailureType");
        }
        EnumJsonAdapter enumJsonAdapterWithUnknownFallback9 = enumJsonAdapterCreate9.withUnknownFallback(routingFailureType);
        Intrinsics.checkNotNullExpressionValue(enumJsonAdapterWithUnknownFallback9, "withUnknownFallback(...)");
        Moshi.Builder builderAdd10 = builderAdd9.add(RoutingFailureType.class, enumJsonAdapterWithUnknownFallback9);
        Intrinsics.checkNotNullExpressionValue(builderAdd10, "add(...)");
        FormType formType = FormType.PreChat;
        EnumJsonAdapter enumJsonAdapterCreate10 = EnumJsonAdapter.create(FormType.class);
        if (formType == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.salesforce.android.smi.network.internal.dto.response.remoteconfig.FormType");
        }
        EnumJsonAdapter enumJsonAdapterWithUnknownFallback10 = enumJsonAdapterCreate10.withUnknownFallback(formType);
        Intrinsics.checkNotNullExpressionValue(enumJsonAdapterWithUnknownFallback10, "withUnknownFallback(...)");
        Moshi.Builder builderAdd11 = builderAdd10.add(FormType.class, enumJsonAdapterWithUnknownFallback10);
        Intrinsics.checkNotNullExpressionValue(builderAdd11, "add(...)");
        AttachmentType attachmentType = AttachmentType.Unknown;
        EnumJsonAdapter enumJsonAdapterCreate11 = EnumJsonAdapter.create(AttachmentType.class);
        if (attachmentType == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.AttachmentType");
        }
        EnumJsonAdapter enumJsonAdapterWithUnknownFallback11 = enumJsonAdapterCreate11.withUnknownFallback(attachmentType);
        Intrinsics.checkNotNullExpressionValue(enumJsonAdapterWithUnknownFallback11, "withUnknownFallback(...)");
        Moshi.Builder builderAdd12 = builderAdd11.add(AttachmentType.class, enumJsonAdapterWithUnknownFallback11);
        Intrinsics.checkNotNullExpressionValue(builderAdd12, "add(...)");
        Moshi moshiBuild = builderAdd12.add(new UUIDAdapter()).add(new URIAdapter()).add(new MessageServerTimestampAdapter2()).add((JsonAdapter.Factory) new KotlinJsonAdapter2()).build();
        Intrinsics.checkNotNullExpressionValue(moshiBuild, "let(...)");
        instance = moshiBuild;
    }
}
