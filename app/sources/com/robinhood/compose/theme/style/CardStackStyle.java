package com.robinhood.compose.theme.style;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: CardStackStyle.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/CardStackStyle;", "", "notificationCardStyle", "Lcom/robinhood/compose/theme/style/NotificationCardStyle;", "getNotificationCardStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/NotificationCardStyle;", "notificationEndCardStyle", "Lcom/robinhood/compose/theme/style/NotificationEndCardStyle;", "getNotificationEndCardStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/NotificationEndCardStyle;", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface CardStackStyle {
    @JvmName
    NotificationCardStyle getNotificationCardStyle(Composer composer, int i);

    @JvmName
    NotificationEndCardStyle getNotificationEndCardStyle(Composer composer, int i);
}
