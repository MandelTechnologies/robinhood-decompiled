package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: InitializerViewModelFactory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a7\u0010\u0007\u001a\u00020\u0005\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\t*\u00020\u00042\u0019\b\b\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\b0\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, m3636d2 = {"viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "builder", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "", "Lkotlin/ExtensionFunctionType;", "initializer", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "lifecycle-viewmodel_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@JvmName
/* renamed from: androidx.lifecycle.viewmodel.InitializerViewModelFactoryKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class InitializerViewModelFactory3 {
    public static final ViewModelProvider.Factory viewModelFactory(Function1<? super InitializerViewModelFactory2, Unit> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        InitializerViewModelFactory2 initializerViewModelFactory2 = new InitializerViewModelFactory2();
        builder.invoke(initializerViewModelFactory2);
        return initializerViewModelFactory2.build();
    }

    public static final /* synthetic */ <VM extends ViewModel> void initializer(InitializerViewModelFactory2 initializerViewModelFactory2, Function1<? super CreationExtras, ? extends VM> initializer) {
        Intrinsics.checkNotNullParameter(initializerViewModelFactory2, "<this>");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        Intrinsics.reifiedOperationMarker(4, "VM");
        initializerViewModelFactory2.addInitializer(Reflection.getOrCreateKotlinClass(ViewModel.class), initializer);
    }
}
