package com.robinhood.android.navigation.compose.destination;

import android.os.Parcelable;
import androidx.navigation.NamedNavArgument;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BaseComposableDestination.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/navigation/compose/destination/BaseComposableDestination;", "Landroid/os/Parcelable;", "routePath", "", "getRoutePath", "()Ljava/lang/String;", "argumentList", "", "Landroidx/navigation/NamedNavArgument;", "getArgumentList", "()Ljava/util/List;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "Lcom/robinhood/android/navigation/compose/destination/DialogDestination;", "Lcom/robinhood/android/navigation/compose/destination/DialogDestinationWithArgs;", "Lcom/robinhood/android/navigation/compose/destination/SheetDestination;", "Lcom/robinhood/android/navigation/compose/destination/SheetDestinationWithArgs;", "lib-navigation-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface BaseComposableDestination extends Parcelable {
    List<NamedNavArgument> getArgumentList();

    String getRoutePath();
}
