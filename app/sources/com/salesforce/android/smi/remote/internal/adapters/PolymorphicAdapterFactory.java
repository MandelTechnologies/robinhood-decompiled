package com.salesforce.android.smi.remote.internal.adapters;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.citations.CitedDetails;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.citations.CitedReference;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input.Input;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input.InputSection;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input.InputValue;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.result.FormResult;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.value.Value;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.optionItem.OptionItem;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.optionItem.titleItem.TitleItem;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken.StreamingToken;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken.StreamingTokenMessageFormat;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.ChoicesFormat;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.ChoicesResponseFormat;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.FormFormat;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.FormResponseFormat;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.ProgressIndicatorFormat;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.StaticContentFormat;
import com.salesforce.android.smi.network.data.domain.prechat.InternalPreChatField;
import com.salesforce.android.smi.network.data.domain.prechat.PreChatField;
import com.salesforce.android.smi.network.data.domain.prechat.choicelist.InternalChoiceListField;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PolymorphicAdapterFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 52\u00020\u0001:\u00015B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0004\b\u000b\u0010\tJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\r\u0010\tJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006¢\u0006\u0004\b\u000f\u0010\tJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006¢\u0006\u0004\b\u0011\u0010\tJ\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006¢\u0006\u0004\b\u0013\u0010\tJ\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006¢\u0006\u0004\b\u0015\u0010\tJ\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006¢\u0006\u0004\b\u0017\u0010\tJ\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006¢\u0006\u0004\b\u0019\u0010\tJ\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0006¢\u0006\u0004\b\u001b\u0010\tJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0006¢\u0006\u0004\b\u001d\u0010\tJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006¢\u0006\u0004\b\u001f\u0010\tJ\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0006¢\u0006\u0004\b!\u0010\tJ\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0006¢\u0006\u0004\b#\u0010\tJ\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0006¢\u0006\u0004\b%\u0010\tJ\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0006¢\u0006\u0004\b'\u0010\tJ\u0013\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0006¢\u0006\u0004\b)\u0010\tJ\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u0006¢\u0006\u0004\b+\u0010\tJ\u0013\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0006¢\u0006\u0004\b-\u0010\tJ\u0013\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0006¢\u0006\u0004\b/\u0010\tJ\u0013\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0006¢\u0006\u0004\b1\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u00104¨\u00066"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/adapters/PolymorphicAdapterFactory;", "", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/adapters/PolymorphicJsonAdapterFactory;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "entryAdapter", "()Lcom/squareup/moshi/adapters/PolymorphicJsonAdapterFactory;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "messageAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat;", "staticFormatAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset;", "attachmentFileTypeAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat;", "choicesFormatAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesResponseFormat;", "choicesResponseFormatAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ProgressIndicatorFormat;", "progressIndicatorFormatAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem;", "optionItemAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem;", "titleItemAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormFormat;", "formFormatAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormResponseFormat;", "formResponseFormatAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputSection;", "inputSectionAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input;", "inputAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputValue;", "inputValueAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/FormResult;", "formResultAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value;", "formResponseValueAdapter", "Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatField;", "preChatFieldTypeAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingToken;", "streamingTokenAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingTokenMessageFormat;", "streamingTokenMessageFormatAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedReference;", "citedReferenceAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedDetails;", "citedDetailsAdapter", "Lcom/squareup/moshi/Moshi;", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "Companion", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class PolymorphicAdapterFactory {
    private final Moshi moshi;

    public PolymorphicAdapterFactory(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
    }

    public /* synthetic */ PolymorphicAdapterFactory(Moshi moshi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Moshi.Builder().build() : moshi);
    }

    public final PolymorphicJsonAdapterFactory<EntryPayload> entryAdapter() {
        PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(EntryPayload.class, "entryType").withSubtype(EntryPayload.MessagePayload.class, "Message").withSubtype(EntryPayload.TypingIndicatorPayload.class, "TypingIndicator").withSubtype(EntryPayload.TypingStartedIndicatorPayload.class, "TypingStartedIndicator").withSubtype(EntryPayload.TypingStoppedIndicatorPayload.class, "TypingStoppedIndicator").withSubtype(EntryPayload.ParticipantChangedPayload.class, "ParticipantChanged").withSubtype(EntryPayload.AcknowledgeDeliveryPayload.class, "DeliveryAcknowledgement").withSubtype(EntryPayload.AcknowledgeReadPayload.class, "ReadAcknowledgement").withSubtype(EntryPayload.RoutingResultPayload.class, "RoutingResult").withSubtype(EntryPayload.RoutingWorkResultPayload.class, "RoutingWorkResult").withSubtype(EntryPayload.StreamingTokenPayload.class, "StreamingToken").withSubtype(EntryPayload.UnknownEntryPayload.class, "UnknownEntry").withSubtype(EntryPayload.ProgressIndicatorPayload.class, "ProgressIndicator");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        JsonAdapter jsonAdapterAdapter = this.moshi.adapter(EntryPayload.UnknownEntryPayload.class);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        PolymorphicJsonAdapterFactory<EntryPayload> polymorphicJsonAdapterFactoryWithFallbackJsonAdapter = MoshiExt.withFallbackJsonAdapter(polymorphicJsonAdapterFactoryWithSubtype, jsonAdapterAdapter);
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithFallbackJsonAdapter, "withFallbackJsonAdapter(...)");
        return polymorphicJsonAdapterFactoryWithFallbackJsonAdapter;
    }

    public final PolymorphicJsonAdapterFactory<Message> messageAdapter() {
        PolymorphicJsonAdapterFactory<Message> polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(Message.class, "messageType").withSubtype(Message.StaticContentMessage.class, "StaticContentMessage").withSubtype(Message.ChoicesMessage.class, "ChoicesMessage").withSubtype(Message.ChoicesResponseMessage.class, "ChoicesResponseMessage").withSubtype(Message.FormMessage.class, "FormMessage").withSubtype(Message.FormResponseMessage.class, "FormResponseMessage");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        return polymorphicJsonAdapterFactoryWithSubtype;
    }

    public final PolymorphicJsonAdapterFactory<StaticContentFormat> staticFormatAdapter() {
        PolymorphicJsonAdapterFactory<StaticContentFormat> polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(StaticContentFormat.class, "formatType").withSubtype(StaticContentFormat.TextFormat.class, "Text").withSubtype(StaticContentFormat.RichLinkFormat.class, "RichLink").withSubtype(StaticContentFormat.AttachmentsFormat.class, "Attachments").withSubtype(StaticContentFormat.WebViewFormat.class, "WebView");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        return polymorphicJsonAdapterFactoryWithSubtype;
    }

    public final PolymorphicJsonAdapterFactory<FileAsset> attachmentFileTypeAdapter() {
        PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(FileAsset.class, "mimeType").withSubtype(FileAsset.ImageAsset.class, FileAsset.ImageAsset.ImageMimeType.PNG.getValue()).withSubtype(FileAsset.ImageAsset.class, FileAsset.ImageAsset.ImageMimeType.JPEG.getValue()).withSubtype(FileAsset.ImageAsset.class, FileAsset.ImageAsset.ImageMimeType.JPG.getValue()).withSubtype(FileAsset.ImageAsset.class, FileAsset.ImageAsset.ImageMimeType.BMP.getValue()).withSubtype(FileAsset.ImageAsset.class, FileAsset.ImageAsset.ImageMimeType.GIF.getValue()).withSubtype(FileAsset.ImageAsset.class, FileAsset.ImageAsset.ImageMimeType.TIFF.getValue()).withSubtype(FileAsset.PdfAsset.class, FileAsset.PdfAsset.PdfMimeType.PDF.getValue());
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        JsonAdapter jsonAdapterAdapter = this.moshi.adapter(FileAsset.UnknownAsset.class);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        PolymorphicJsonAdapterFactory<FileAsset> polymorphicJsonAdapterFactoryWithFallbackJsonAdapter = MoshiExt.withFallbackJsonAdapter(polymorphicJsonAdapterFactoryWithSubtype, jsonAdapterAdapter);
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithFallbackJsonAdapter, "withFallbackJsonAdapter(...)");
        return polymorphicJsonAdapterFactoryWithFallbackJsonAdapter;
    }

    public final PolymorphicJsonAdapterFactory<ChoicesFormat> choicesFormatAdapter() {
        PolymorphicJsonAdapterFactory<ChoicesFormat> polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(ChoicesFormat.class, "formatType").withSubtype(ChoicesFormat.QuickRepliesFormat.class, "QuickReplies").withSubtype(ChoicesFormat.DisplayableOptionsFormat.class, "Buttons").withSubtype(ChoicesFormat.CarouselFormat.class, "Carousel");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        return polymorphicJsonAdapterFactoryWithSubtype;
    }

    public final PolymorphicJsonAdapterFactory<ChoicesResponseFormat> choicesResponseFormatAdapter() {
        PolymorphicJsonAdapterFactory<ChoicesResponseFormat> polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(ChoicesResponseFormat.class, "formatType").withSubtype(ChoicesResponseFormat.ChoicesResponseSelectionsFormat.class, "Selections");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        return polymorphicJsonAdapterFactoryWithSubtype;
    }

    public final PolymorphicJsonAdapterFactory<ProgressIndicatorFormat> progressIndicatorFormatAdapter() {
        PolymorphicJsonAdapterFactory<ProgressIndicatorFormat> polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(ProgressIndicatorFormat.class, "formatType").withSubtype(ProgressIndicatorFormat.Text.class, "Text");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        return polymorphicJsonAdapterFactoryWithSubtype;
    }

    public final PolymorphicJsonAdapterFactory<OptionItem.TypedOptionItem> optionItemAdapter() {
        PolymorphicJsonAdapterFactory<OptionItem.TypedOptionItem> polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(OptionItem.TypedOptionItem.class, "itemType").withSubtype(OptionItem.TypedOptionItem.TitleOptionItem.class, "TitleOptionItem");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        return polymorphicJsonAdapterFactoryWithSubtype;
    }

    public final PolymorphicJsonAdapterFactory<TitleItem> titleItemAdapter() {
        PolymorphicJsonAdapterFactory<TitleItem> polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(TitleItem.class, "itemType").withSubtype(TitleItem.DefaultTitleItem.class, "TitleItem").withSubtype(TitleItem.TitleImageItem.class, "TitleImageItem");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        return polymorphicJsonAdapterFactoryWithSubtype;
    }

    public final PolymorphicJsonAdapterFactory<FormFormat> formFormatAdapter() {
        PolymorphicJsonAdapterFactory<FormFormat> polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(FormFormat.class, "formatType").withSubtype(FormFormat.InputsFormat.class, "Inputs");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        return polymorphicJsonAdapterFactoryWithSubtype;
    }

    public final PolymorphicJsonAdapterFactory<FormResponseFormat> formResponseFormatAdapter() {
        PolymorphicJsonAdapterFactory<FormResponseFormat> polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(FormResponseFormat.class, "formatType").withSubtype(FormResponseFormat.InputsFormResponseFormat.class, "Inputs").withSubtype(FormResponseFormat.ResultFormResponseFormat.class, "Result");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        return polymorphicJsonAdapterFactoryWithSubtype;
    }

    public final PolymorphicJsonAdapterFactory<InputSection> inputSectionAdapter() {
        PolymorphicJsonAdapterFactory<InputSection> polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(InputSection.class, "sectionType").withSubtype(InputSection.SingleInputSection.class, "SingleInputSection");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        return polymorphicJsonAdapterFactoryWithSubtype;
    }

    public final PolymorphicJsonAdapterFactory<Input> inputAdapter() {
        PolymorphicJsonAdapterFactory<Input> polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(Input.class, "inputType").withSubtype(Input.SelectInput.class, "SelectInput").withSubtype(Input.OptionPickerInput.class, "OptionPickerInput").withSubtype(Input.DatePickerInput.class, "DatePickerInput").withSubtype(Input.TextInput.class, "TextInput");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        return polymorphicJsonAdapterFactoryWithSubtype;
    }

    public final PolymorphicJsonAdapterFactory<InputValue> inputValueAdapter() {
        PolymorphicJsonAdapterFactory<InputValue> polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(InputValue.class, "inputValueType").withSubtype(InputValue.SingleInputValue.class, "SingleInputValue").withSubtype(InputValue.SelectedOptionsInputValue.class, "SelectedOptionsInputValue");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        return polymorphicJsonAdapterFactoryWithSubtype;
    }

    public final PolymorphicJsonAdapterFactory<FormResult> formResultAdapter() {
        PolymorphicJsonAdapterFactory<FormResult> polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(FormResult.class, "resultType").withSubtype(FormResult.FormRecordsResult.class, "FormRecordsResult").withSubtype(FormResult.FormErrorResult.class, "FormErrorResult");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        return polymorphicJsonAdapterFactoryWithSubtype;
    }

    public final PolymorphicJsonAdapterFactory<Value> formResponseValueAdapter() {
        PolymorphicJsonAdapterFactory<Value> polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(Value.class, "valueType").withSubtype(Value.TextValue.class, "TextValue").withSubtype(Value.IntegerValue.class, "IntegerValue").withSubtype(Value.DoubleValue.class, "DoubleValue").withSubtype(Value.UrlValue.class, "UrlValue").withSubtype(Value.DateValue.class, "DateValue").withSubtype(Value.DateTimeValue.class, "DateTimeValue");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        return polymorphicJsonAdapterFactoryWithSubtype;
    }

    public final PolymorphicJsonAdapterFactory<PreChatField> preChatFieldTypeAdapter() {
        PolymorphicJsonAdapterFactory<PreChatField> polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(PreChatField.class, "type").withSubtype(InternalPreChatField.class, "Text").withSubtype(InternalPreChatField.class, "Number").withSubtype(InternalPreChatField.class, "Phone").withSubtype(InternalPreChatField.class, "Checkbox").withSubtype(InternalPreChatField.class, "Email").withSubtype(InternalChoiceListField.class, "ChoiceList");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        return polymorphicJsonAdapterFactoryWithSubtype;
    }

    public final PolymorphicJsonAdapterFactory<StreamingToken> streamingTokenAdapter() {
        PolymorphicJsonAdapterFactory<StreamingToken> polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(StreamingToken.class, "tokenType").withSubtype(StreamingToken.MessageStreamingToken.class, "MessageStreamingToken").withSubtype(StreamingToken.StreamingTokenValidation.class, "StreamingTokenValidation");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        return polymorphicJsonAdapterFactoryWithSubtype;
    }

    public final PolymorphicJsonAdapterFactory<StreamingTokenMessageFormat> streamingTokenMessageFormatAdapter() {
        PolymorphicJsonAdapterFactory<StreamingTokenMessageFormat> polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(StreamingTokenMessageFormat.class, "formatType").withSubtype(StreamingTokenMessageFormat.StreamingTextFormat.class, "Text");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        return polymorphicJsonAdapterFactoryWithSubtype;
    }

    public final PolymorphicJsonAdapterFactory<CitedReference> citedReferenceAdapter() {
        PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(CitedReference.class, "citedReferenceType").withSubtype(CitedReference.LinkCitedReference.class, "Link");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        JsonAdapter jsonAdapterAdapter = this.moshi.adapter(EntryPayload.UnknownEntryPayload.class);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        PolymorphicJsonAdapterFactory<CitedReference> polymorphicJsonAdapterFactoryWithFallbackJsonAdapter = MoshiExt.withFallbackJsonAdapter(polymorphicJsonAdapterFactoryWithSubtype, jsonAdapterAdapter);
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithFallbackJsonAdapter, "withFallbackJsonAdapter(...)");
        return polymorphicJsonAdapterFactoryWithFallbackJsonAdapter;
    }

    public final PolymorphicJsonAdapterFactory<CitedDetails> citedDetailsAdapter() {
        PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(CitedDetails.class, "citedDetailsType").withSubtype(CitedDetails.InlineMetadataCitedDetails.class, "InlineMetadata");
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        JsonAdapter jsonAdapterAdapter = this.moshi.adapter(EntryPayload.UnknownEntryPayload.class);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        PolymorphicJsonAdapterFactory<CitedDetails> polymorphicJsonAdapterFactoryWithFallbackJsonAdapter = MoshiExt.withFallbackJsonAdapter(polymorphicJsonAdapterFactoryWithSubtype, jsonAdapterAdapter);
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithFallbackJsonAdapter, "withFallbackJsonAdapter(...)");
        return polymorphicJsonAdapterFactoryWithFallbackJsonAdapter;
    }
}
