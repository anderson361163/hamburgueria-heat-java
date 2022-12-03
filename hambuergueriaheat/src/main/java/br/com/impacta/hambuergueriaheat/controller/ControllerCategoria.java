package br.com.impacta.hambuergueriaheat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.impacta.hambuergueriaheat.dto.DTOCategoria;
import br.com.impacta.hambuergueriaheat.mapper.CategoriaMapper;
import br.com.impacta.hambuergueriaheat.model.Categoria;
import br.com.impacta.hambuergueriaheat.service.CategoriaService;

@Controller
@RequestMapping("/admin/")
public class ControllerCategoria {

	@Autowired
	private CategoriaService serviceCategoria;

	@GetMapping("/category")
	public String listarcategoria(Model model) {
		List<Categoria> listarTodasCategorias = serviceCategoria.listarTodasCategorias();
		model.addAttribute("listarTodasCategorias", listarTodasCategorias);
		return "categoria/catecategory_listing";
	}

	@GetMapping("/category/new")
	public String formularioCategoria(Model model) {
		model.addAttribute("titulo", "Nova categoria");

		return "categoria/category_form";
	}

	@PostMapping("/category")
	public String criarCategoria(DTOCategoria categoria) {
		serviceCategoria.salvarCategoria(CategoriaMapper.toModel(categoria));
		return "categoria/category";
	}
	/*
	 * 
	 * 
	 * db.session.add(category) db.session.commit()
	 * 
	 * flash('Categoria cadastrado com sucesso') return
	 * redirect(url_for('category.index'))
	 * 
	 * 
	 * @category_bp.route('/admin/category/<int:id>', methods=['GET'])
	 * 
	 * @login_required def category_view(id: int): category = Category.query.get(id)
	 * 
	 * return render_template( 'category_form.j2', title='Editar categoria',
	 * category=category, action=f'/admin/category/{id}' )
	 * 
	 * 
	 * @category_bp.route('/admin/category/<int:id>', methods=['DELETE'])
	 * 
	 * @login_required def delete_category(id: int): category =
	 * Category.query.get(id)
	 * 
	 * db.session.delete(category) db.session.commit()
	 * 
	 * flash('Categoria excluída com sucesso') return {}
	 * 
	 * 
	 * @category_bp.route('/admin/category/<int:id>', methods=['POST'])
	 * 
	 * @login_required def update_category(id: int): form = request.form
	 * 
	 * category = Category.query.get(id)
	 * 
	 * category.name = form['name'] category.description = form['description']
	 * db.session.commit()
	 * 
	 * flash('Categoria atualizada com sucesso') return
	 * redirect(url_for('category.index'))
	 */

}
