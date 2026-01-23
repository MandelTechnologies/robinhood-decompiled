package com.robinhood.shared.store.chat.common;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.models.chat.common.UnsentInput;
import com.robinhood.shared.store.chat.common.ChatCache;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatCache.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a$\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005\u001a$\u0010\u0007\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\b\u001a\u00020\u0004\"\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, "", "Lcom/robinhood/shared/store/chat/common/ChatCache$Item;", "", "", "Lcom/robinhood/shared/models/chat/common/UnsentInput;", "unsentInput", "remove", "localMessageSid", "KEY_CHAT_INPUT_DRAFT", "KEY_CHAT_UNSENT_INPUTS", "lib-store-chat-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.store.chat.common.ChatCacheKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ChatCache2 {
    private static final String KEY_CHAT_INPUT_DRAFT = "key_chat_input_draft";
    private static final String KEY_CHAT_UNSENT_INPUTS = "key_chat_unsent_inputs";

    public static final void save(ChatCache.Item<Map<String, UnsentInput>> item, UnsentInput unsentInput) {
        Intrinsics.checkNotNullParameter(item, "<this>");
        Intrinsics.checkNotNullParameter(unsentInput, "unsentInput");
        Map<String, UnsentInput> mapEmptyMap = item.get();
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        item.set(MapsKt.plus(mapEmptyMap, Tuples4.m3642to(unsentInput.getLocalSid(), unsentInput)));
    }

    public static final void remove(ChatCache.Item<Map<String, UnsentInput>> item, String localMessageSid) {
        Intrinsics.checkNotNullParameter(item, "<this>");
        Intrinsics.checkNotNullParameter(localMessageSid, "localMessageSid");
        Map<String, UnsentInput> mapEmptyMap = item.get();
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        item.set(MapsKt.minus(mapEmptyMap, localMessageSid));
    }
}
