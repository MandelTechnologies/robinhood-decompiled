package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment;

import kotlin.Metadata;

/* compiled from: FileMimeType.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileMimeType;", "", "value", "", "getValue", "()Ljava/lang/String;", "EnumValueTypeHelper", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$GenericMimeType;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$ImageAsset$ImageMimeType;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$PdfAsset$PdfMimeType;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface FileMimeType {

    /* compiled from: FileMimeType.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileMimeType$EnumValueTypeHelper;", "T", "", "enumValueOfOrNull", "value", "", "(Ljava/lang/String;)Ljava/lang/Object;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface EnumValueTypeHelper<T> {
        T enumValueOfOrNull(String value);
    }

    String getValue();
}
