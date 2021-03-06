package gmail.Lance5057.com;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Locale;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class moltenDogbeariumFluid
  extends BlockFluidClassic
{
  private IIcon stillIcon;
  private IIcon flowingIcon;
  private String stillIconTexture = "molten_Dogbearium";
  private String flowIconTexture = "molten_Dogbearium_flow";
  
  public moltenDogbeariumFluid(Fluid fluid)
  {
    super(fluid, Material.lava);
    setLightLevel(100.0F);
    setHardness(1.0F);
    setBlockName("MoltenDogbearium");
    
    this.stillIconTexture = ("tinkersdefense:" + stillIconTexture);
    this.flowIconTexture = ("tinkersdefense:" + flowIconTexture);
  }
  
  @SideOnly(Side.CLIENT)
  public void func_149651_a(IIconRegister icon)
  {
    this.stillIcon = icon.registerIcon(this.stillIconTexture);
    this.flowingIcon = icon.registerIcon(this.flowIconTexture);
    
    getFluid().setIcons(this.stillIcon, this.flowingIcon);
  }
  
  public IIcon getStillIcon()
  {
    return this.stillIcon;
  }
  
  public IIcon getFlowingIcon()
  {
    return this.flowingIcon;
  }
  
  @SideOnly(Side.CLIENT)
  public IIcon func_149691_a(int side, int meta)
  {
    if (side <= 1) {
      return this.stillIcon;
    }
    return this.flowingIcon;
  }
}
